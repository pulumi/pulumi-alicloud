// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetTransitRouterRouteTablesTable;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTransitRouterRouteTablesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of CEN Transit Router Route Table IDs.
     * 
     */
    private List<String> ids;
    private @Nullable String nameRegex;
    /**
     * @return A list of name of CEN Transit Router Route Tables.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String status;
    /**
     * @return A list of CEN Route Entries. Each element contains the following attributes:
     * 
     */
    private List<GetTransitRouterRouteTablesTable> tables;
    private String transitRouterId;
    private @Nullable List<String> transitRouterRouteTableIds;
    private @Nullable List<String> transitRouterRouteTableNames;
    /**
     * @return The status of the route table.
     * 
     */
    private @Nullable String transitRouterRouteTableStatus;

    private GetTransitRouterRouteTablesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of CEN Transit Router Route Table IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of name of CEN Transit Router Route Tables.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return A list of CEN Route Entries. Each element contains the following attributes:
     * 
     */
    public List<GetTransitRouterRouteTablesTable> tables() {
        return this.tables;
    }
    public String transitRouterId() {
        return this.transitRouterId;
    }
    public List<String> transitRouterRouteTableIds() {
        return this.transitRouterRouteTableIds == null ? List.of() : this.transitRouterRouteTableIds;
    }
    public List<String> transitRouterRouteTableNames() {
        return this.transitRouterRouteTableNames == null ? List.of() : this.transitRouterRouteTableNames;
    }
    /**
     * @return The status of the route table.
     * 
     */
    public Optional<String> transitRouterRouteTableStatus() {
        return Optional.ofNullable(this.transitRouterRouteTableStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRouterRouteTablesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String status;
        private List<GetTransitRouterRouteTablesTable> tables;
        private String transitRouterId;
        private @Nullable List<String> transitRouterRouteTableIds;
        private @Nullable List<String> transitRouterRouteTableNames;
        private @Nullable String transitRouterRouteTableStatus;
        public Builder() {}
        public Builder(GetTransitRouterRouteTablesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
    	      this.tables = defaults.tables;
    	      this.transitRouterId = defaults.transitRouterId;
    	      this.transitRouterRouteTableIds = defaults.transitRouterRouteTableIds;
    	      this.transitRouterRouteTableNames = defaults.transitRouterRouteTableNames;
    	      this.transitRouterRouteTableStatus = defaults.transitRouterRouteTableStatus;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterRouteTablesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterRouteTablesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterRouteTablesResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tables(List<GetTransitRouterRouteTablesTable> tables) {
            if (tables == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterRouteTablesResult", "tables");
            }
            this.tables = tables;
            return this;
        }
        public Builder tables(GetTransitRouterRouteTablesTable... tables) {
            return tables(List.of(tables));
        }
        @CustomType.Setter
        public Builder transitRouterId(String transitRouterId) {
            if (transitRouterId == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterRouteTablesResult", "transitRouterId");
            }
            this.transitRouterId = transitRouterId;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterRouteTableIds(@Nullable List<String> transitRouterRouteTableIds) {

            this.transitRouterRouteTableIds = transitRouterRouteTableIds;
            return this;
        }
        public Builder transitRouterRouteTableIds(String... transitRouterRouteTableIds) {
            return transitRouterRouteTableIds(List.of(transitRouterRouteTableIds));
        }
        @CustomType.Setter
        public Builder transitRouterRouteTableNames(@Nullable List<String> transitRouterRouteTableNames) {

            this.transitRouterRouteTableNames = transitRouterRouteTableNames;
            return this;
        }
        public Builder transitRouterRouteTableNames(String... transitRouterRouteTableNames) {
            return transitRouterRouteTableNames(List.of(transitRouterRouteTableNames));
        }
        @CustomType.Setter
        public Builder transitRouterRouteTableStatus(@Nullable String transitRouterRouteTableStatus) {

            this.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
            return this;
        }
        public GetTransitRouterRouteTablesResult build() {
            final var _resultValue = new GetTransitRouterRouteTablesResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            _resultValue.tables = tables;
            _resultValue.transitRouterId = transitRouterId;
            _resultValue.transitRouterRouteTableIds = transitRouterRouteTableIds;
            _resultValue.transitRouterRouteTableNames = transitRouterRouteTableNames;
            _resultValue.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
            return _resultValue;
        }
    }
}