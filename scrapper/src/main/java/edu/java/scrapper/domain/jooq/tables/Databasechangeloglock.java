/*
 * This file is generated by jOOQ.
 */
package edu.java.scrapper.domain.jooq.tables;


import edu.java.scrapper.domain.jooq.Keys;
import edu.java.scrapper.domain.jooq.Public;
import edu.java.scrapper.domain.jooq.tables.records.DatabasechangeloglockRecord;

import java.time.LocalDateTime;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Databasechangeloglock extends TableImpl<DatabasechangeloglockRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.databasechangeloglock</code>
     */
    public static final Databasechangeloglock DATABASECHANGELOGLOCK = new Databasechangeloglock();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<DatabasechangeloglockRecord> getRecordType() {
        return DatabasechangeloglockRecord.class;
    }

    /**
     * The column <code>public.databasechangeloglock.id</code>.
     */
    public final TableField<DatabasechangeloglockRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.databasechangeloglock.locked</code>.
     */
    public final TableField<DatabasechangeloglockRecord, Boolean> LOCKED = createField(DSL.name("locked"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.databasechangeloglock.lockgranted</code>.
     */
    public final TableField<DatabasechangeloglockRecord, LocalDateTime> LOCKGRANTED = createField(DSL.name("lockgranted"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.databasechangeloglock.lockedby</code>.
     */
    public final TableField<DatabasechangeloglockRecord, String> LOCKEDBY = createField(DSL.name("lockedby"), SQLDataType.VARCHAR(255), this, "");

    private Databasechangeloglock(Name alias, Table<DatabasechangeloglockRecord> aliased) {
        this(alias, aliased, null);
    }

    private Databasechangeloglock(Name alias, Table<DatabasechangeloglockRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.databasechangeloglock</code> table
     * reference
     */
    public Databasechangeloglock(String alias) {
        this(DSL.name(alias), DATABASECHANGELOGLOCK);
    }

    /**
     * Create an aliased <code>public.databasechangeloglock</code> table
     * reference
     */
    public Databasechangeloglock(Name alias) {
        this(alias, DATABASECHANGELOGLOCK);
    }

    /**
     * Create a <code>public.databasechangeloglock</code> table reference
     */
    public Databasechangeloglock() {
        this(DSL.name("databasechangeloglock"), null);
    }

    public <O extends Record> Databasechangeloglock(Table<O> child, ForeignKey<O, DatabasechangeloglockRecord> key) {
        super(child, key, DATABASECHANGELOGLOCK);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    @NotNull
    public UniqueKey<DatabasechangeloglockRecord> getPrimaryKey() {
        return Keys.DATABASECHANGELOGLOCK_PKEY;
    }

    @Override
    @NotNull
    public Databasechangeloglock as(String alias) {
        return new Databasechangeloglock(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public Databasechangeloglock as(Name alias) {
        return new Databasechangeloglock(alias, this);
    }

    @Override
    @NotNull
    public Databasechangeloglock as(Table<?> alias) {
        return new Databasechangeloglock(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Databasechangeloglock rename(String name) {
        return new Databasechangeloglock(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Databasechangeloglock rename(Name name) {
        return new Databasechangeloglock(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Databasechangeloglock rename(Table<?> name) {
        return new Databasechangeloglock(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Integer, Boolean, LocalDateTime, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super Boolean, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super Boolean, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
