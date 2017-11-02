/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.LexemeFrequencyLabel;

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
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LexemeFrequencyLabelRecord extends TableRecordImpl<LexemeFrequencyLabelRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 825301878;

    /**
     * Setter for <code>public.lexeme_frequency_label.code</code>.
     */
    public void setCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.lexeme_frequency_label.code</code>.
     */
    public String getCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.lexeme_frequency_label.value</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.lexeme_frequency_label.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.lexeme_frequency_label.lang</code>.
     */
    public void setLang(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.lexeme_frequency_label.lang</code>.
     */
    public String getLang() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.lexeme_frequency_label.type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.lexeme_frequency_label.type</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return LexemeFrequencyLabel.LEXEME_FREQUENCY_LABEL.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return LexemeFrequencyLabel.LEXEME_FREQUENCY_LABEL.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LexemeFrequencyLabel.LEXEME_FREQUENCY_LABEL.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LexemeFrequencyLabel.LEXEME_FREQUENCY_LABEL.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getValue();
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
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getValue();
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
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeFrequencyLabelRecord value1(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeFrequencyLabelRecord value2(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeFrequencyLabelRecord value3(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeFrequencyLabelRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeFrequencyLabelRecord values(String value1, String value2, String value3, String value4) {
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
     * Create a detached LexemeFrequencyLabelRecord
     */
    public LexemeFrequencyLabelRecord() {
        super(LexemeFrequencyLabel.LEXEME_FREQUENCY_LABEL);
    }

    /**
     * Create a detached, initialised LexemeFrequencyLabelRecord
     */
    public LexemeFrequencyLabelRecord(String code, String value, String lang, String type) {
        super(LexemeFrequencyLabel.LEXEME_FREQUENCY_LABEL);

        set(0, code);
        set(1, value);
        set(2, lang);
        set(3, type);
    }
}