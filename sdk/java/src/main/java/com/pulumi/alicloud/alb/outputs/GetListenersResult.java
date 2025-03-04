// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.alicloud.alb.outputs.GetListenersListener;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetListenersResult {
    private @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable List<String> listenerIds;
    private @Nullable String listenerProtocol;
    private List<GetListenersListener> listeners;
    private @Nullable List<String> loadBalancerIds;
    private @Nullable String outputFile;
    private @Nullable String status;

    private GetListenersResult() {}
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
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
    public List<String> listenerIds() {
        return this.listenerIds == null ? List.of() : this.listenerIds;
    }
    public Optional<String> listenerProtocol() {
        return Optional.ofNullable(this.listenerProtocol);
    }
    public List<GetListenersListener> listeners() {
        return this.listeners;
    }
    public List<String> loadBalancerIds() {
        return this.loadBalancerIds == null ? List.of() : this.loadBalancerIds;
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

    public static Builder builder(GetListenersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable List<String> listenerIds;
        private @Nullable String listenerProtocol;
        private List<GetListenersListener> listeners;
        private @Nullable List<String> loadBalancerIds;
        private @Nullable String outputFile;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetListenersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.listenerIds = defaults.listenerIds;
    	      this.listenerProtocol = defaults.listenerProtocol;
    	      this.listeners = defaults.listeners;
    	      this.loadBalancerIds = defaults.loadBalancerIds;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {

            this.enableDetails = enableDetails;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetListenersResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetListenersResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder listenerIds(@Nullable List<String> listenerIds) {

            this.listenerIds = listenerIds;
            return this;
        }
        public Builder listenerIds(String... listenerIds) {
            return listenerIds(List.of(listenerIds));
        }
        @CustomType.Setter
        public Builder listenerProtocol(@Nullable String listenerProtocol) {

            this.listenerProtocol = listenerProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder listeners(List<GetListenersListener> listeners) {
            if (listeners == null) {
              throw new MissingRequiredPropertyException("GetListenersResult", "listeners");
            }
            this.listeners = listeners;
            return this;
        }
        public Builder listeners(GetListenersListener... listeners) {
            return listeners(List.of(listeners));
        }
        @CustomType.Setter
        public Builder loadBalancerIds(@Nullable List<String> loadBalancerIds) {

            this.loadBalancerIds = loadBalancerIds;
            return this;
        }
        public Builder loadBalancerIds(String... loadBalancerIds) {
            return loadBalancerIds(List.of(loadBalancerIds));
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
        public GetListenersResult build() {
            final var _resultValue = new GetListenersResult();
            _resultValue.enableDetails = enableDetails;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.listenerIds = listenerIds;
            _resultValue.listenerProtocol = listenerProtocol;
            _resultValue.listeners = listeners;
            _resultValue.loadBalancerIds = loadBalancerIds;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
