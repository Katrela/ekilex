/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ViewWwSimilarityJudgementData;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class ViewWwSimilarityJudgementDataRecord extends TableRecordImpl<ViewWwSimilarityJudgementDataRecord> implements Record4<Long, String, String, String> {

    private static final long serialVersionUID = -1992183392;

    /**
     * Setter for <code>public.view_ww_similarity_judgement_data.meaning_id</code>.
     */
    public void setMeaningId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.view_ww_similarity_judgement_data.meaning_id</code>.
     */
    public Long getMeaningId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.view_ww_similarity_judgement_data.word</code>.
     */
    public void setWord(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.view_ww_similarity_judgement_data.word</code>.
     */
    public String getWord() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.view_ww_similarity_judgement_data.lang</code>.
     */
    public void setLang(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.view_ww_similarity_judgement_data.lang</code>.
     */
    public String getLang() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.view_ww_similarity_judgement_data.dataset_code</code>.
     */
    public void setDatasetCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.view_ww_similarity_judgement_data.dataset_code</code>.
     */
    public String getDatasetCode() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ViewWwSimilarityJudgementData.VIEW_WW_SIMILARITY_JUDGEMENT_DATA.MEANING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewWwSimilarityJudgementData.VIEW_WW_SIMILARITY_JUDGEMENT_DATA.WORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewWwSimilarityJudgementData.VIEW_WW_SIMILARITY_JUDGEMENT_DATA.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewWwSimilarityJudgementData.VIEW_WW_SIMILARITY_JUDGEMENT_DATA.DATASET_CODE;
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
    public String component4() {
        return getDatasetCode();
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
    public String value4() {
        return getDatasetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwSimilarityJudgementDataRecord value1(Long value) {
        setMeaningId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwSimilarityJudgementDataRecord value2(String value) {
        setWord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwSimilarityJudgementDataRecord value3(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwSimilarityJudgementDataRecord value4(String value) {
        setDatasetCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwSimilarityJudgementDataRecord values(Long value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewWwSimilarityJudgementDataRecord
     */
    public ViewWwSimilarityJudgementDataRecord() {
        super(ViewWwSimilarityJudgementData.VIEW_WW_SIMILARITY_JUDGEMENT_DATA);
    }

    /**
     * Create a detached, initialised ViewWwSimilarityJudgementDataRecord
     */
    public ViewWwSimilarityJudgementDataRecord(Long meaningId, String word, String lang, String datasetCode) {
        super(ViewWwSimilarityJudgementData.VIEW_WW_SIMILARITY_JUDGEMENT_DATA);

        set(0, meaningId);
        set(1, word);
        set(2, lang);
        set(3, datasetCode);
    }
}
