/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.udt;


import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.udt.records.TypeWordRecord;

import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.UDTImpl;


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
public class TypeWord extends UDTImpl<TypeWordRecord> {

    private static final long serialVersionUID = -910040214;

    /**
     * The reference instance of <code>public.type_word</code>
     */
    public static final TypeWord TYPE_WORD = new TypeWord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TypeWordRecord> getRecordType() {
        return TypeWordRecord.class;
    }

    /**
     * The attribute <code>public.type_word.lexeme_id</code>.
     */
    public static final UDTField<TypeWordRecord, Long> LEXEME_ID = createField("lexeme_id", org.jooq.impl.SQLDataType.BIGINT, TYPE_WORD, "");

    /**
     * The attribute <code>public.type_word.meaning_id</code>.
     */
    public static final UDTField<TypeWordRecord, Long> MEANING_ID = createField("meaning_id", org.jooq.impl.SQLDataType.BIGINT, TYPE_WORD, "");

    /**
     * The attribute <code>public.type_word.value</code>.
     */
    public static final UDTField<TypeWordRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB, TYPE_WORD, "");

    /**
     * The attribute <code>public.type_word.lang</code>.
     */
    public static final UDTField<TypeWordRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3), TYPE_WORD, "");

    /**
     * The attribute <code>public.type_word.dataset_code</code>.
     */
    public static final UDTField<TypeWordRecord, String> DATASET_CODE = createField("dataset_code", org.jooq.impl.SQLDataType.VARCHAR(10), TYPE_WORD, "");

    /**
     * No further instances allowed
     */
    private TypeWord() {
        super("type_word", null, null, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }
}
