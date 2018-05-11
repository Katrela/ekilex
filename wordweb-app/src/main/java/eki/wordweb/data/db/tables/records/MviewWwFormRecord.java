/*
 * This file is generated by jOOQ.
*/
package eki.wordweb.data.db.tables.records;


import eki.wordweb.data.db.tables.MviewWwForm;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MviewWwFormRecord extends TableRecordImpl<MviewWwFormRecord> implements Record13<Long, String, String, Long, Long, String, String, String[], String, String, String, Boolean, String[]> {

    private static final long serialVersionUID = 1263336159;

    /**
     * Setter for <code>public.mview_ww_form.word_id</code>.
     */
    public void setWordId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.mview_ww_form.word</code>.
     */
    public void setWord(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.word</code>.
     */
    public String getWord() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.mview_ww_form.lang</code>.
     */
    public void setLang(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.lang</code>.
     */
    public String getLang() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.mview_ww_form.paradigm_id</code>.
     */
    public void setParadigmId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.paradigm_id</code>.
     */
    public Long getParadigmId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.mview_ww_form.form_id</code>.
     */
    public void setFormId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.form_id</code>.
     */
    public Long getFormId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.mview_ww_form.form</code>.
     */
    public void setForm(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.form</code>.
     */
    public String getForm() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.mview_ww_form.morph_code</code>.
     */
    public void setMorphCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.morph_code</code>.
     */
    public String getMorphCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.mview_ww_form.components</code>.
     */
    public void setComponents(String... value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.components</code>.
     */
    public String[] getComponents() {
        return (String[]) get(7);
    }

    /**
     * Setter for <code>public.mview_ww_form.display_form</code>.
     */
    public void setDisplayForm(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.display_form</code>.
     */
    public String getDisplayForm() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.mview_ww_form.vocal_form</code>.
     */
    public void setVocalForm(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.vocal_form</code>.
     */
    public String getVocalForm() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.mview_ww_form.sound_file</code>.
     */
    public void setSoundFile(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.sound_file</code>.
     */
    public String getSoundFile() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.mview_ww_form.is_word</code>.
     */
    public void setIsWord(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.is_word</code>.
     */
    public Boolean getIsWord() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>public.mview_ww_form.dataset_codes</code>.
     */
    public void setDatasetCodes(String... value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.mview_ww_form.dataset_codes</code>.
     */
    public String[] getDatasetCodes() {
        return (String[]) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, Long, Long, String, String, String[], String, String, String, Boolean, String[]> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, Long, Long, String, String, String[], String, String, String, Boolean, String[]> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MviewWwForm.MVIEW_WW_FORM.WORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MviewWwForm.MVIEW_WW_FORM.WORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MviewWwForm.MVIEW_WW_FORM.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return MviewWwForm.MVIEW_WW_FORM.PARADIGM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return MviewWwForm.MVIEW_WW_FORM.FORM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MviewWwForm.MVIEW_WW_FORM.FORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MviewWwForm.MVIEW_WW_FORM.MORPH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field8() {
        return MviewWwForm.MVIEW_WW_FORM.COMPONENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MviewWwForm.MVIEW_WW_FORM.DISPLAY_FORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return MviewWwForm.MVIEW_WW_FORM.VOCAL_FORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return MviewWwForm.MVIEW_WW_FORM.SOUND_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return MviewWwForm.MVIEW_WW_FORM.IS_WORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field13() {
        return MviewWwForm.MVIEW_WW_FORM.DATASET_CODES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getParadigmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getFormId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getMorphCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component8() {
        return getComponents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getDisplayForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getVocalForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSoundFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getIsWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component13() {
        return getDatasetCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getWordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getParadigmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getFormId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMorphCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value8() {
        return getComponents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDisplayForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getVocalForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSoundFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getIsWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value13() {
        return getDatasetCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value1(Long value) {
        setWordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value2(String value) {
        setWord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value3(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value4(Long value) {
        setParadigmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value5(Long value) {
        setFormId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value6(String value) {
        setForm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value7(String value) {
        setMorphCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value8(String... value) {
        setComponents(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value9(String value) {
        setDisplayForm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value10(String value) {
        setVocalForm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value11(String value) {
        setSoundFile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value12(Boolean value) {
        setIsWord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord value13(String... value) {
        setDatasetCodes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwFormRecord values(Long value1, String value2, String value3, Long value4, Long value5, String value6, String value7, String[] value8, String value9, String value10, String value11, Boolean value12, String[] value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MviewWwFormRecord
     */
    public MviewWwFormRecord() {
        super(MviewWwForm.MVIEW_WW_FORM);
    }

    /**
     * Create a detached, initialised MviewWwFormRecord
     */
    public MviewWwFormRecord(Long wordId, String word, String lang, Long paradigmId, Long formId, String form, String morphCode, String[] components, String displayForm, String vocalForm, String soundFile, Boolean isWord, String[] datasetCodes) {
        super(MviewWwForm.MVIEW_WW_FORM);

        set(0, wordId);
        set(1, word);
        set(2, lang);
        set(3, paradigmId);
        set(4, formId);
        set(5, form);
        set(6, morphCode);
        set(7, components);
        set(8, displayForm);
        set(9, vocalForm);
        set(10, soundFile);
        set(11, isWord);
        set(12, datasetCodes);
    }
}
