/*
 * This file is generated by jOOQ.
*/
package eki.wordweb.data.db.udt.records;


import eki.wordweb.data.db.udt.TypeDefinition;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UDTRecordImpl;


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
public class TypeDefinitionRecord extends UDTRecordImpl<TypeDefinitionRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 194765174;

    /**
     * Setter for <code>public.type_definition.value</code>.
     */
    public void setValue(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.type_definition.value</code>.
     */
    public String getValue() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.type_definition.lang</code>.
     */
    public void setLang(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.type_definition.lang</code>.
     */
    public String getLang() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TypeDefinition.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TypeDefinition.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeDefinitionRecord value1(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeDefinitionRecord value2(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeDefinitionRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TypeDefinitionRecord
     */
    public TypeDefinitionRecord() {
        super(TypeDefinition.TYPE_DEFINITION);
    }

    /**
     * Create a detached, initialised TypeDefinitionRecord
     */
    public TypeDefinitionRecord(String value, String lang) {
        super(TypeDefinition.TYPE_DEFINITION);

        set(0, value);
        set(1, lang);
    }
}