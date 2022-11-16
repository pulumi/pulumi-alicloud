// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ots.outputs;

import com.pulumi.alicloud.ots.outputs.GetTablesTable;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTablesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of table IDs.
     * 
     */
    private final List<String> ids;
    /**
     * @return The OTS instance name.
     * 
     */
    private final String instanceName;
    private final @Nullable String nameRegex;
    /**
     * @return A list of table names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;
    /**
     * @return A list of tables. Each element contains the following attributes:
     * 
     */
    private final List<GetTablesTable> tables;

    @CustomType.Constructor
    private GetTablesResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instanceName") String instanceName,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("tables") List<GetTablesTable> tables) {
        this.id = id;
        this.ids = ids;
        this.instanceName = instanceName;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.tables = tables;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of table IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return The OTS instance name.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of table names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of tables. Each element contains the following attributes:
     * 
     */
    public List<GetTablesTable> tables() {
        return this.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTablesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private String instanceName;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetTablesTable> tables;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTablesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceName = defaults.instanceName;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.tables = defaults.tables;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder tables(List<GetTablesTable> tables) {
            this.tables = Objects.requireNonNull(tables);
            return this;
        }
        public Builder tables(GetTablesTable... tables) {
            return tables(List.of(tables));
        }        public GetTablesResult build() {
            return new GetTablesResult(id, ids, instanceName, nameRegex, names, outputFile, tables);
        }
    }
}