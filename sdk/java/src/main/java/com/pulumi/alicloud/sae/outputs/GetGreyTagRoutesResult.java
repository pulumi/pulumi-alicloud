// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.alicloud.sae.outputs.GetGreyTagRoutesRoute;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGreyTagRoutesResult {
    private String appId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private List<GetGreyTagRoutesRoute> routes;

    private GetGreyTagRoutesResult() {}
    public String appId() {
        return this.appId;
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
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetGreyTagRoutesRoute> routes() {
        return this.routes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGreyTagRoutesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String appId;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetGreyTagRoutesRoute> routes;
        public Builder() {}
        public Builder(GetGreyTagRoutesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.routes = defaults.routes;
        }

        @CustomType.Setter
        public Builder appId(String appId) {
            if (appId == null) {
              throw new MissingRequiredPropertyException("GetGreyTagRoutesResult", "appId");
            }
            this.appId = appId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGreyTagRoutesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetGreyTagRoutesResult", "ids");
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
              throw new MissingRequiredPropertyException("GetGreyTagRoutesResult", "names");
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
        public Builder routes(List<GetGreyTagRoutesRoute> routes) {
            if (routes == null) {
              throw new MissingRequiredPropertyException("GetGreyTagRoutesResult", "routes");
            }
            this.routes = routes;
            return this;
        }
        public Builder routes(GetGreyTagRoutesRoute... routes) {
            return routes(List.of(routes));
        }
        public GetGreyTagRoutesResult build() {
            final var _resultValue = new GetGreyTagRoutesResult();
            _resultValue.appId = appId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.routes = routes;
            return _resultValue;
        }
    }
}
