// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect.outputs;

import com.pulumi.alicloud.expressconnect.outputs.GetRouterInterfacesFilter;
import com.pulumi.alicloud.expressconnect.outputs.GetRouterInterfacesInterface;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRouterInterfacesResult {
    private @Nullable List<GetRouterInterfacesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of Router Interface IDs.
     * 
     */
    private List<String> ids;
    private @Nullable String includeReservationData;
    /**
     * @return A list of Router Interface Entries. Each element contains the following attributes:
     * 
     */
    private List<GetRouterInterfacesInterface> interfaces;
    private @Nullable String nameRegex;
    /**
     * @return A list of name of Router Interfaces.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable Integer pageNumber;
    private @Nullable Integer pageSize;

    private GetRouterInterfacesResult() {}
    public List<GetRouterInterfacesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of Router Interface IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> includeReservationData() {
        return Optional.ofNullable(this.includeReservationData);
    }
    /**
     * @return A list of Router Interface Entries. Each element contains the following attributes:
     * 
     */
    public List<GetRouterInterfacesInterface> interfaces() {
        return this.interfaces;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of name of Router Interfaces.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterInterfacesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetRouterInterfacesFilter> filters;
        private String id;
        private List<String> ids;
        private @Nullable String includeReservationData;
        private List<GetRouterInterfacesInterface> interfaces;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        public Builder() {}
        public Builder(GetRouterInterfacesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.includeReservationData = defaults.includeReservationData;
    	      this.interfaces = defaults.interfaces;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetRouterInterfacesFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetRouterInterfacesFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRouterInterfacesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetRouterInterfacesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder includeReservationData(@Nullable String includeReservationData) {

            this.includeReservationData = includeReservationData;
            return this;
        }
        @CustomType.Setter
        public Builder interfaces(List<GetRouterInterfacesInterface> interfaces) {
            if (interfaces == null) {
              throw new MissingRequiredPropertyException("GetRouterInterfacesResult", "interfaces");
            }
            this.interfaces = interfaces;
            return this;
        }
        public Builder interfaces(GetRouterInterfacesInterface... interfaces) {
            return interfaces(List.of(interfaces));
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetRouterInterfacesResult", "names");
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
        public Builder pageNumber(@Nullable Integer pageNumber) {

            this.pageNumber = pageNumber;
            return this;
        }
        @CustomType.Setter
        public Builder pageSize(@Nullable Integer pageSize) {

            this.pageSize = pageSize;
            return this;
        }
        public GetRouterInterfacesResult build() {
            final var _resultValue = new GetRouterInterfacesResult();
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.includeReservationData = includeReservationData;
            _resultValue.interfaces = interfaces;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.pageNumber = pageNumber;
            _resultValue.pageSize = pageSize;
            return _resultValue;
        }
    }
}