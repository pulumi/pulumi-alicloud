// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.videosurveillance.outputs;

import com.pulumi.alicloud.videosurveillance.outputs.GetSystemGroupsGroup;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSystemGroupsResult {
    private List<GetSystemGroupsGroup> groups;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String inProtocol;
    private @Nullable String name;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String status;

    private GetSystemGroupsResult() {}
    public List<GetSystemGroupsGroup> groups() {
        return this.groups;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> inProtocol() {
        return Optional.ofNullable(this.inProtocol);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemGroupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSystemGroupsGroup> groups;
        private String id;
        private List<String> ids;
        private @Nullable String inProtocol;
        private @Nullable String name;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetSystemGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.inProtocol = defaults.inProtocol;
    	      this.name = defaults.name;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder groups(List<GetSystemGroupsGroup> groups) {
            if (groups == null) {
              throw new MissingRequiredPropertyException("GetSystemGroupsResult", "groups");
            }
            this.groups = groups;
            return this;
        }
        public Builder groups(GetSystemGroupsGroup... groups) {
            return groups(List.of(groups));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSystemGroupsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetSystemGroupsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder inProtocol(@Nullable String inProtocol) {

            this.inProtocol = inProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetSystemGroupsResult", "names");
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
        public GetSystemGroupsResult build() {
            final var _resultValue = new GetSystemGroupsResult();
            _resultValue.groups = groups;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.inProtocol = inProtocol;
            _resultValue.name = name;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}