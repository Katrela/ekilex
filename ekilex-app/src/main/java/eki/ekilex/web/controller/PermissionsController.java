package eki.ekilex.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import eki.common.constant.AuthorityItem;
import eki.common.constant.AuthorityOperation;
import eki.ekilex.constant.WebConstant;
import eki.ekilex.data.EkiUser;
import eki.ekilex.data.EkiUserPermData;
import eki.ekilex.service.PermissionService;
import eki.ekilex.service.UserService;
import eki.ekilex.web.util.UserContext;

@ConditionalOnWebApplication
@Controller
@SessionAttributes(WebConstant.SESSION_BEAN)
public class PermissionsController extends AbstractPageController {

	private static final Logger logger = LoggerFactory.getLogger(PermissionsController.class);

	@Autowired
	private UserService userService;

	@Autowired
	private PermissionService permissionService;

	@Autowired
	private UserContext userContext;

	@GetMapping(PERMISSIONS_URI)
	public String permissions(Model model) {
		EkiUser user = userContext.getUser();
		if (!user.isDatasetOwnershipExist()) {
			return "redirect:" + HOME_URI;
		}
		populateModel(model);
		return PERMISSIONS_PAGE;
	}

	@GetMapping(PERMISSIONS_URI + "/enable/{userId}")
	public String enable(@PathVariable("userId") Long userId, Model model) {
		userService.enableUser(userId, true);
		populateModel(model);
		return PERMISSIONS_PAGE + " :: permissions";
	}

	@GetMapping(PERMISSIONS_URI + "/disable/{userId}")
	public String disable(@PathVariable("userId") Long userId, Model model) {
		userService.enableUser(userId, false);
		populateModel(model);
		return PERMISSIONS_PAGE + " :: permissions";
	}

	@GetMapping(PERMISSIONS_URI + "/setadmin/{userId}")
	public String setAdmin(@PathVariable("userId") Long userId, Model model) {
		userService.setAdmin(userId, true);
		populateModel(model);
		return PERMISSIONS_PAGE + " :: permissions";
	}

	@GetMapping(PERMISSIONS_URI + "/remadmin/{userId}")
	public String remAdmin(@PathVariable("userId") Long userId, Model model) {
		userService.setAdmin(userId, false);
		populateModel(model);
		return PERMISSIONS_PAGE + " :: permissions";
	}

	@PostMapping(PERMISSIONS_URI + "/adddatasetperm")
	public String addDatasetPerm(
			@RequestParam("userId") Long userId,
			@RequestParam(value = "datasetCode", required = false) String datasetCode,
			@RequestParam(value = "authItem", required = false) AuthorityItem authItem,
			@RequestParam(value = "authOp", required = false) AuthorityOperation authOp,
			@RequestParam(value = "authLang", required = false) String authLang,
			Model model) {

		permissionService.createDatasetPermission(userId, datasetCode, authItem, authOp, authLang);

		return "redirect:" + PERMISSIONS_URI;
	}

	@GetMapping(PERMISSIONS_URI + "/deletedatasetperm/{datasetPermissionId}")
	public String deleteDatasetPerm(@PathVariable("datasetPermissionId") Long datasetPermissionId, Model model) {
		permissionService.deleteDatasetPermission(datasetPermissionId);
		populateModel(model);
		return PERMISSIONS_PAGE + " :: permissions";
	}

	private void populateModel(Model model) {
		List<EkiUserPermData> ekiUserPermissions = permissionService.getEkiUserPermissions();
		model.addAttribute("ekiUserPermissions", ekiUserPermissions);
	}
}
