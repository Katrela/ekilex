/*
 * This file is generated by jOOQ.
*/
package eki.wordweb.data.db.tables.records;


import eki.wordweb.data.db.tables.DblinkGetResult;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DblinkGetResultRecord extends TableRecordImpl<DblinkGetResultRecord> implements Record1<Record> {

    private static final long serialVersionUID = -1912405496;

    /**
     * Setter for <code>public.dblink_get_result.dblink_get_result</code>.
     */
    public void setDblinkGetResult(Record value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.dblink_get_result.dblink_get_result</code>.
     */
    public Record getDblinkGetResult() {
        return (Record) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Record> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Record> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Record> field1() {
        return DblinkGetResult.DBLINK_GET_RESULT.DBLINK_GET_RESULT_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record component1() {
        return getDblinkGetResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record value1() {
        return getDblinkGetResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DblinkGetResultRecord value1(Record value) {
        setDblinkGetResult(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DblinkGetResultRecord values(Record value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DblinkGetResultRecord
     */
    public DblinkGetResultRecord() {
        super(DblinkGetResult.DBLINK_GET_RESULT);
    }

    /**
     * Create a detached, initialised DblinkGetResultRecord
     */
    public DblinkGetResultRecord(Record dblinkGetResult) {
        super(DblinkGetResult.DBLINK_GET_RESULT);

        set(0, dblinkGetResult);
    }
}
