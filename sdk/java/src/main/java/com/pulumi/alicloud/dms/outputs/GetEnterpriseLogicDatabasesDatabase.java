// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEnterpriseLogicDatabasesDatabase {
    /**
     * @return Logical Library alias.
     * 
     */
    private String alias;
    /**
     * @return Sub-Database ID.
     * 
     */
    private List<String> databaseIds;
    /**
     * @return Database type.
     * 
     */
    private String dbType;
    /**
     * @return Environment type, return value is as follows:-product: production environment-dev: development environment-pre: Advance Environment-test: test environment-sit:SIT environment-uat:UAT environment-pet: Pressure measurement environment-stag:STAG environment
     * 
     */
    private String envType;
    /**
     * @return Logic Database ID.
     * 
     */
    private String id;
    /**
     * @return Whether it is a logical Library, the return value is true.
     * 
     */
    private Boolean logic;
    /**
     * @return The ID of the logical Library.
     * 
     */
    private String logicDatabaseId;
    /**
     * @return The user ID list of the logical library Owner.
     * 
     */
    private List<String> ownerIdLists;
    /**
     * @return The nickname list of the logical library Owner.
     * 
     */
    private List<String> ownerNameLists;
    /**
     * @return Logical Library name.
     * 
     */
    private String schemaName;
    /**
     * @return Logical library search name.
     * 
     */
    private String searchName;

    private GetEnterpriseLogicDatabasesDatabase() {}
    /**
     * @return Logical Library alias.
     * 
     */
    public String alias() {
        return this.alias;
    }
    /**
     * @return Sub-Database ID.
     * 
     */
    public List<String> databaseIds() {
        return this.databaseIds;
    }
    /**
     * @return Database type.
     * 
     */
    public String dbType() {
        return this.dbType;
    }
    /**
     * @return Environment type, return value is as follows:-product: production environment-dev: development environment-pre: Advance Environment-test: test environment-sit:SIT environment-uat:UAT environment-pet: Pressure measurement environment-stag:STAG environment
     * 
     */
    public String envType() {
        return this.envType;
    }
    /**
     * @return Logic Database ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether it is a logical Library, the return value is true.
     * 
     */
    public Boolean logic() {
        return this.logic;
    }
    /**
     * @return The ID of the logical Library.
     * 
     */
    public String logicDatabaseId() {
        return this.logicDatabaseId;
    }
    /**
     * @return The user ID list of the logical library Owner.
     * 
     */
    public List<String> ownerIdLists() {
        return this.ownerIdLists;
    }
    /**
     * @return The nickname list of the logical library Owner.
     * 
     */
    public List<String> ownerNameLists() {
        return this.ownerNameLists;
    }
    /**
     * @return Logical Library name.
     * 
     */
    public String schemaName() {
        return this.schemaName;
    }
    /**
     * @return Logical library search name.
     * 
     */
    public String searchName() {
        return this.searchName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnterpriseLogicDatabasesDatabase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alias;
        private List<String> databaseIds;
        private String dbType;
        private String envType;
        private String id;
        private Boolean logic;
        private String logicDatabaseId;
        private List<String> ownerIdLists;
        private List<String> ownerNameLists;
        private String schemaName;
        private String searchName;
        public Builder() {}
        public Builder(GetEnterpriseLogicDatabasesDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.databaseIds = defaults.databaseIds;
    	      this.dbType = defaults.dbType;
    	      this.envType = defaults.envType;
    	      this.id = defaults.id;
    	      this.logic = defaults.logic;
    	      this.logicDatabaseId = defaults.logicDatabaseId;
    	      this.ownerIdLists = defaults.ownerIdLists;
    	      this.ownerNameLists = defaults.ownerNameLists;
    	      this.schemaName = defaults.schemaName;
    	      this.searchName = defaults.searchName;
        }

        @CustomType.Setter
        public Builder alias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }
        @CustomType.Setter
        public Builder databaseIds(List<String> databaseIds) {
            this.databaseIds = Objects.requireNonNull(databaseIds);
            return this;
        }
        public Builder databaseIds(String... databaseIds) {
            return databaseIds(List.of(databaseIds));
        }
        @CustomType.Setter
        public Builder dbType(String dbType) {
            this.dbType = Objects.requireNonNull(dbType);
            return this;
        }
        @CustomType.Setter
        public Builder envType(String envType) {
            this.envType = Objects.requireNonNull(envType);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder logic(Boolean logic) {
            this.logic = Objects.requireNonNull(logic);
            return this;
        }
        @CustomType.Setter
        public Builder logicDatabaseId(String logicDatabaseId) {
            this.logicDatabaseId = Objects.requireNonNull(logicDatabaseId);
            return this;
        }
        @CustomType.Setter
        public Builder ownerIdLists(List<String> ownerIdLists) {
            this.ownerIdLists = Objects.requireNonNull(ownerIdLists);
            return this;
        }
        public Builder ownerIdLists(String... ownerIdLists) {
            return ownerIdLists(List.of(ownerIdLists));
        }
        @CustomType.Setter
        public Builder ownerNameLists(List<String> ownerNameLists) {
            this.ownerNameLists = Objects.requireNonNull(ownerNameLists);
            return this;
        }
        public Builder ownerNameLists(String... ownerNameLists) {
            return ownerNameLists(List.of(ownerNameLists));
        }
        @CustomType.Setter
        public Builder schemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }
        @CustomType.Setter
        public Builder searchName(String searchName) {
            this.searchName = Objects.requireNonNull(searchName);
            return this;
        }
        public GetEnterpriseLogicDatabasesDatabase build() {
            final var o = new GetEnterpriseLogicDatabasesDatabase();
            o.alias = alias;
            o.databaseIds = databaseIds;
            o.dbType = dbType;
            o.envType = envType;
            o.id = id;
            o.logic = logic;
            o.logicDatabaseId = logicDatabaseId;
            o.ownerIdLists = ownerIdLists;
            o.ownerNameLists = ownerNameLists;
            o.schemaName = schemaName;
            o.searchName = searchName;
            return o;
        }
    }
}