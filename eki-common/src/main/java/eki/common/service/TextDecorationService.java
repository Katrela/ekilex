package eki.common.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import eki.common.constant.TextDecoration;
import eki.common.data.TextDecorationDescriptor;

@Component
public class TextDecorationService implements InitializingBean, TextDecoration {

	private static final String EKI_MARKUP_GENERIC_PATTERN = "[&]\\w+[;]";

	private static final String EKI_MARKUP_PATTERN_1 = "(&ema;(.+?)&eml;)";

	private static final String EKI_MARKUP_PATTERN_2 = "(&ba;(.+?)&bl;)";

	private static final String EKI_MARKUP_PATTERN_3 = "(&suba;(.+?)&subl;)";

	private static final String EKI_MARKUP_PATTERN_4 = "(&supa;(.+?)&supl;)";

	private static final String EKI_MARKUP_PATTERN_V = "(&v;)";

	private static final String EKI_MARKUP_PATTERN_ETC = "(&(ehk|Hrl|hrl|ja|jne|jt|ka|nt|puudub|vm|vms|vrd|vt|напр.|и др.|и т. п.|г.);)";

	private List<TextDecorationDescriptor> ekiMarkupDescriptors;

	private Pattern ekiEntityPatternV;

	private Pattern ekiEntityPatternEtc;

	@Override
	public void afterPropertiesSet() throws Exception {

		ekiMarkupDescriptors = new ArrayList<>();

		Pattern entityMatchPattern;
		String preDecoration, postDecoration;
		TextDecorationDescriptor textDecorationDescriptor;

		entityMatchPattern = Pattern.compile(EKI_MARKUP_PATTERN_1);
		preDecoration = "<" + EKI_ELEMENT_1 + ">";
		postDecoration = "</" + EKI_ELEMENT_1 + ">";
		textDecorationDescriptor = new TextDecorationDescriptor(entityMatchPattern, preDecoration, postDecoration);
		ekiMarkupDescriptors.add(textDecorationDescriptor);

		entityMatchPattern = Pattern.compile(EKI_MARKUP_PATTERN_2);
		preDecoration = "<" + EKI_ELEMENT_2 + ">";
		postDecoration = "</" + EKI_ELEMENT_2 + ">";
		textDecorationDescriptor = new TextDecorationDescriptor(entityMatchPattern, preDecoration, postDecoration);
		ekiMarkupDescriptors.add(textDecorationDescriptor);

		entityMatchPattern = Pattern.compile(EKI_MARKUP_PATTERN_3);
		preDecoration = "<" + EKI_ELEMENT_3 + ">";
		postDecoration = "</" + EKI_ELEMENT_3 + ">";
		textDecorationDescriptor = new TextDecorationDescriptor(entityMatchPattern, preDecoration, postDecoration);
		ekiMarkupDescriptors.add(textDecorationDescriptor);

		entityMatchPattern = Pattern.compile(EKI_MARKUP_PATTERN_4);
		preDecoration = "<" + EKI_ELEMENT_4 + ">";
		postDecoration = "</" + EKI_ELEMENT_4 + ">";
		textDecorationDescriptor = new TextDecorationDescriptor(entityMatchPattern, preDecoration, postDecoration);
		ekiMarkupDescriptors.add(textDecorationDescriptor);

		ekiEntityPatternV = entityMatchPattern = Pattern.compile(EKI_MARKUP_PATTERN_V);
		preDecoration = "<" + EKI_ELEMENT_5 + ">~</" + EKI_ELEMENT_5 + ">";
		postDecoration = null;
		textDecorationDescriptor = new TextDecorationDescriptor(entityMatchPattern, preDecoration, postDecoration);
		ekiMarkupDescriptors.add(textDecorationDescriptor);

		ekiEntityPatternEtc = entityMatchPattern = Pattern.compile(EKI_MARKUP_PATTERN_ETC);
		preDecoration = "<" + EKI_ELEMENT_5 + ">";
		postDecoration = "</" + EKI_ELEMENT_5 + ">";
		textDecorationDescriptor = new TextDecorationDescriptor(entityMatchPattern, preDecoration, postDecoration);
		ekiMarkupDescriptors.add(textDecorationDescriptor);
	}

	public String cleanEkiElementMarkup(String originalText) {
		if (StringUtils.isBlank(originalText)) {
			return originalText;
		}
		String cleanText = RegExUtils.removePattern(originalText, "<[^>]*>");
		return cleanText;
	}

	public String cleanEkiEntityMarkup(String originalText) {
		if (StringUtils.isBlank(originalText)) {
			return originalText;
		}
		originalText = applyPattern(ekiEntityPatternV, originalText, null, null, "~");
		originalText = applyPattern(ekiEntityPatternEtc, originalText, null, null, null);
		return RegExUtils.removePattern(originalText, EKI_MARKUP_GENERIC_PATTERN);
	}

	public String convertEkiEntityMarkup(String originalText) {

		if (StringUtils.isEmpty(originalText)) {
			return originalText;
		}

		String convertedText = new String(originalText);
		Pattern pattern;
		String preDecoration;
		String postDecoration;

		for (TextDecorationDescriptor textDecorationDescriptor : ekiMarkupDescriptors) {
			pattern = textDecorationDescriptor.getEntityMatchPattern();
			preDecoration = textDecorationDescriptor.getPreDecoration();
			postDecoration = textDecorationDescriptor.getPostDecoration();
			convertedText = applyPattern(pattern, convertedText, preDecoration, postDecoration, null);
		}
		return convertedText;
	}

	private String applyPattern(Pattern pattern, String text, String preDecoration, String postDecoration, String matchReplacement) {

		StringBuffer decorBuf = new StringBuffer();
		Matcher matcher = pattern.matcher(text);
		int textLength = text.length();
		int textStart = 0;
		int matchStart;
		int matchEnd;
		String cleanFragment;
		String matchFragment;
		while (matcher.find()) {
			matchStart = matcher.start();
			matchEnd = matcher.end();
			cleanFragment = StringUtils.substring(text, textStart, matchStart);
			decorBuf.append(cleanFragment);
			if (matchReplacement == null) {
				if (matcher.groupCount() > 1) {
					matchFragment = matcher.group(2);
				} else {
					matchFragment = null;
				}
			} else {
				matchFragment = matchReplacement;
			}
			if ((preDecoration == null) && (postDecoration == null)) {
				decorBuf.append(matchFragment);
			} else if ((preDecoration != null) && (postDecoration == null)) {
				decorBuf.append(preDecoration);
			} else {
				decorBuf.append(preDecoration);
				decorBuf.append(matchFragment);
				decorBuf.append(postDecoration);
			}
			textStart = matchEnd;
		}
		if (textStart < textLength) {
			cleanFragment = StringUtils.substring(text, textStart, textLength);
			decorBuf.append(cleanFragment);
		}
		text = decorBuf.toString();
		return text;
	}
}
