/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ViewWwMeaning;
import eki.ekilex.data.db.udt.records.TypeDefinitionRecord;
import eki.ekilex.data.db.udt.records.TypeDomainRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwMeaningRecord extends TableRecordImpl<ViewWwMeaningRecord> implements Record7<Long, TypeDomainRecord[], String[], String[], String[], String[], TypeDefinitionRecord[]> {

    private static final long serialVersionUID = -1965426011;

    /**
     * Setter for <code>public.view_ww_meaning.meaning_id</code>.
     */
    public void setMeaningId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.view_ww_meaning.meaning_id</code>.
     */
    public Long getMeaningId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.view_ww_meaning.domain_codes</code>.
     */
    public void setDomainCodes(TypeDomainRecord... value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.view_ww_meaning.domain_codes</code>.
     */
    public TypeDomainRecord[] getDomainCodes() {
        return (TypeDomainRecord[]) get(1);
    }

    /**
     * Setter for <code>public.view_ww_meaning.image_files</code>.
     */
    public void setImageFiles(String... value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.view_ww_meaning.image_files</code>.
     */
    public String[] getImageFiles() {
        return (String[]) get(2);
    }

    /**
     * Setter for <code>public.view_ww_meaning.systematic_polysemy_patterns</code>.
     */
    public void setSystematicPolysemyPatterns(String... value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.view_ww_meaning.systematic_polysemy_patterns</code>.
     */
    public String[] getSystematicPolysemyPatterns() {
        return (String[]) get(3);
    }

    /**
     * Setter for <code>public.view_ww_meaning.semantic_types</code>.
     */
    public void setSemanticTypes(String... value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.view_ww_meaning.semantic_types</code>.
     */
    public String[] getSemanticTypes() {
        return (String[]) get(4);
    }

    /**
     * Setter for <code>public.view_ww_meaning.learner_comments</code>.
     */
    public void setLearnerComments(String... value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.view_ww_meaning.learner_comments</code>.
     */
    public String[] getLearnerComments() {
        return (String[]) get(5);
    }

    /**
     * Setter for <code>public.view_ww_meaning.definitions</code>.
     */
    public void setDefinitions(TypeDefinitionRecord... value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.view_ww_meaning.definitions</code>.
     */
    public TypeDefinitionRecord[] getDefinitions() {
        return (TypeDefinitionRecord[]) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, TypeDomainRecord[], String[], String[], String[], String[], TypeDefinitionRecord[]> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, TypeDomainRecord[], String[], String[], String[], String[], TypeDefinitionRecord[]> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ViewWwMeaning.VIEW_WW_MEANING.MEANING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeDomainRecord[]> field2() {
        return ViewWwMeaning.VIEW_WW_MEANING.DOMAIN_CODES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field3() {
        return ViewWwMeaning.VIEW_WW_MEANING.IMAGE_FILES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field4() {
        return ViewWwMeaning.VIEW_WW_MEANING.SYSTEMATIC_POLYSEMY_PATTERNS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field5() {
        return ViewWwMeaning.VIEW_WW_MEANING.SEMANTIC_TYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field6() {
        return ViewWwMeaning.VIEW_WW_MEANING.LEARNER_COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeDefinitionRecord[]> field7() {
        return ViewWwMeaning.VIEW_WW_MEANING.DEFINITIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getMeaningId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeDomainRecord[] component2() {
        return getDomainCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component3() {
        return getImageFiles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component4() {
        return getSystematicPolysemyPatterns();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component5() {
        return getSemanticTypes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component6() {
        return getLearnerComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeDefinitionRecord[] component7() {
        return getDefinitions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getMeaningId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeDomainRecord[] value2() {
        return getDomainCodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value3() {
        return getImageFiles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value4() {
        return getSystematicPolysemyPatterns();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value5() {
        return getSemanticTypes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value6() {
        return getLearnerComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeDefinitionRecord[] value7() {
        return getDefinitions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwMeaningRecord value1(Long value) {
        setMeaningId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwMeaningRecord value2(TypeDomainRecord... value) {
        setDomainCodes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwMeaningRecord value3(String... value) {
        setImageFiles(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwMeaningRecord value4(String... value) {
        setSystematicPolysemyPatterns(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwMeaningRecord value5(String... value) {
        setSemanticTypes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwMeaningRecord value6(String... value) {
        setLearnerComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwMeaningRecord value7(TypeDefinitionRecord... value) {
        setDefinitions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwMeaningRecord values(Long value1, TypeDomainRecord[] value2, String[] value3, String[] value4, String[] value5, String[] value6, TypeDefinitionRecord[] value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewWwMeaningRecord
     */
    public ViewWwMeaningRecord() {
        super(ViewWwMeaning.VIEW_WW_MEANING);
    }

    /**
     * Create a detached, initialised ViewWwMeaningRecord
     */
    public ViewWwMeaningRecord(Long meaningId, TypeDomainRecord[] domainCodes, String[] imageFiles, String[] systematicPolysemyPatterns, String[] semanticTypes, String[] learnerComments, TypeDefinitionRecord[] definitions) {
        super(ViewWwMeaning.VIEW_WW_MEANING);

        set(0, meaningId);
        set(1, domainCodes);
        set(2, imageFiles);
        set(3, systematicPolysemyPatterns);
        set(4, semanticTypes);
        set(5, learnerComments);
        set(6, definitions);
    }
}
