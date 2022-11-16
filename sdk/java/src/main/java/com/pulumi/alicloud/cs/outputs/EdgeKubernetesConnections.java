// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeKubernetesConnections {
    private final @Nullable String apiServerInternet;
    private final @Nullable String apiServerIntranet;
    private final @Nullable String masterPublicIp;
    private final @Nullable String serviceDomain;

    @CustomType.Constructor
    private EdgeKubernetesConnections(
        @CustomType.Parameter("apiServerInternet") @Nullable String apiServerInternet,
        @CustomType.Parameter("apiServerIntranet") @Nullable String apiServerIntranet,
        @CustomType.Parameter("masterPublicIp") @Nullable String masterPublicIp,
        @CustomType.Parameter("serviceDomain") @Nullable String serviceDomain) {
        this.apiServerInternet = apiServerInternet;
        this.apiServerIntranet = apiServerIntranet;
        this.masterPublicIp = masterPublicIp;
        this.serviceDomain = serviceDomain;
    }

    public Optional<String> apiServerInternet() {
        return Optional.ofNullable(this.apiServerInternet);
    }
    public Optional<String> apiServerIntranet() {
        return Optional.ofNullable(this.apiServerIntranet);
    }
    public Optional<String> masterPublicIp() {
        return Optional.ofNullable(this.masterPublicIp);
    }
    public Optional<String> serviceDomain() {
        return Optional.ofNullable(this.serviceDomain);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeKubernetesConnections defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiServerInternet;
        private @Nullable String apiServerIntranet;
        private @Nullable String masterPublicIp;
        private @Nullable String serviceDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeKubernetesConnections defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiServerInternet = defaults.apiServerInternet;
    	      this.apiServerIntranet = defaults.apiServerIntranet;
    	      this.masterPublicIp = defaults.masterPublicIp;
    	      this.serviceDomain = defaults.serviceDomain;
        }

        public Builder apiServerInternet(@Nullable String apiServerInternet) {
            this.apiServerInternet = apiServerInternet;
            return this;
        }
        public Builder apiServerIntranet(@Nullable String apiServerIntranet) {
            this.apiServerIntranet = apiServerIntranet;
            return this;
        }
        public Builder masterPublicIp(@Nullable String masterPublicIp) {
            this.masterPublicIp = masterPublicIp;
            return this;
        }
        public Builder serviceDomain(@Nullable String serviceDomain) {
            this.serviceDomain = serviceDomain;
            return this;
        }        public EdgeKubernetesConnections build() {
            return new EdgeKubernetesConnections(apiServerInternet, apiServerIntranet, masterPublicIp, serviceDomain);
        }
    }
}