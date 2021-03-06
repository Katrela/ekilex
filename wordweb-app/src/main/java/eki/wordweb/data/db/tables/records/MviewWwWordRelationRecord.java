/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables.records;


import eki.wordweb.data.db.tables.MviewWwWordRelation;
import eki.wordweb.data.db.udt.records.TypeWordRelationRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MviewWwWordRelationRecord extends TableRecordImpl<MviewWwWordRelationRecord> implements Record5<Long, TypeWordRelationRecord[], Long, String, TypeWordRelationRecord[]> {

    private static final long serialVersionUID = -699728592;

    /**
     * Setter for <code>public.mview_ww_word_relation.word_id</code>.
     */
    public void setWordId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.mview_ww_word_relation.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.mview_ww_word_relation.related_words</code>.
     */
    public void setRelatedWords(TypeWordRelationRecord... value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.mview_ww_word_relation.related_words</code>.
     */
    public TypeWordRelationRecord[] getRelatedWords() {
        return (TypeWordRelationRecord[]) get(1);
    }

    /**
     * Setter for <code>public.mview_ww_word_relation.word_group_id</code>.
     */
    public void setWordGroupId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.mview_ww_word_relation.word_group_id</code>.
     */
    public Long getWordGroupId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.mview_ww_word_relation.word_rel_type_code</code>.
     */
    public void setWordRelTypeCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.mview_ww_word_relation.word_rel_type_code</code>.
     */
    public String getWordRelTypeCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.mview_ww_word_relation.word_group_members</code>.
     */
    public void setWordGroupMembers(TypeWordRelationRecord... value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.mview_ww_word_relation.word_group_members</code>.
     */
    public TypeWordRelationRecord[] getWordGroupMembers() {
        return (TypeWordRelationRecord[]) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, TypeWordRelationRecord[], Long, String, TypeWordRelationRecord[]> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, TypeWordRelationRecord[], Long, String, TypeWordRelationRecord[]> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MviewWwWordRelation.MVIEW_WW_WORD_RELATION.WORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeWordRelationRecord[]> field2() {
        return MviewWwWordRelation.MVIEW_WW_WORD_RELATION.RELATED_WORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return MviewWwWordRelation.MVIEW_WW_WORD_RELATION.WORD_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MviewWwWordRelation.MVIEW_WW_WORD_RELATION.WORD_REL_TYPE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeWordRelationRecord[]> field5() {
        return MviewWwWordRelation.MVIEW_WW_WORD_RELATION.WORD_GROUP_MEMBERS;
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
    public TypeWordRelationRecord[] component2() {
        return getRelatedWords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getWordGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getWordRelTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeWordRelationRecord[] component5() {
        return getWordGroupMembers();
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
    public TypeWordRelationRecord[] value2() {
        return getRelatedWords();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getWordGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getWordRelTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeWordRelationRecord[] value5() {
        return getWordGroupMembers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwWordRelationRecord value1(Long value) {
        setWordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwWordRelationRecord value2(TypeWordRelationRecord... value) {
        setRelatedWords(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwWordRelationRecord value3(Long value) {
        setWordGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwWordRelationRecord value4(String value) {
        setWordRelTypeCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwWordRelationRecord value5(TypeWordRelationRecord... value) {
        setWordGroupMembers(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwWordRelationRecord values(Long value1, TypeWordRelationRecord[] value2, Long value3, String value4, TypeWordRelationRecord[] value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MviewWwWordRelationRecord
     */
    public MviewWwWordRelationRecord() {
        super(MviewWwWordRelation.MVIEW_WW_WORD_RELATION);
    }

    /**
     * Create a detached, initialised MviewWwWordRelationRecord
     */
    public MviewWwWordRelationRecord(Long wordId, TypeWordRelationRecord[] relatedWords, Long wordGroupId, String wordRelTypeCode, TypeWordRelationRecord[] wordGroupMembers) {
        super(MviewWwWordRelation.MVIEW_WW_WORD_RELATION);

        set(0, wordId);
        set(1, relatedWords);
        set(2, wordGroupId);
        set(3, wordRelTypeCode);
        set(4, wordGroupMembers);
    }
}
