// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeKubernetesConnectionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeKubernetesConnectionsArgs Empty = new EdgeKubernetesConnectionsArgs();

    /**
     * API Server Internet endpoint.
     * 
     */
    @Import(name="apiServerInternet")
    private @Nullable Output<String> apiServerInternet;

    /**
     * @return API Server Internet endpoint.
     * 
     */
    public Optional<Output<String>> apiServerInternet() {
        return Optional.ofNullable(this.apiServerInternet);
    }

    /**
     * API Server Intranet endpoint.
     * 
     */
    @Import(name="apiServerIntranet")
    private @Nullable Output<String> apiServerIntranet;

    /**
     * @return API Server Intranet endpoint.
     * 
     */
    public Optional<Output<String>> apiServerIntranet() {
        return Optional.ofNullable(this.apiServerIntranet);
    }

    /**
     * Master node SSH IP address.
     * 
     */
    @Import(name="masterPublicIp")
    private @Nullable Output<String> masterPublicIp;

    /**
     * @return Master node SSH IP address.
     * 
     */
    public Optional<Output<String>> masterPublicIp() {
        return Optional.ofNullable(this.masterPublicIp);
    }

    /**
     * Service Access Domain.
     * 
     */
    @Import(name="serviceDomain")
    private @Nullable Output<String> serviceDomain;

    /**
     * @return Service Access Domain.
     * 
     */
    public Optional<Output<String>> serviceDomain() {
        return Optional.ofNullable(this.serviceDomain);
    }

    private EdgeKubernetesConnectionsArgs() {}

    private EdgeKubernetesConnectionsArgs(EdgeKubernetesConnectionsArgs $) {
        this.apiServerInternet = $.apiServerInternet;
        this.apiServerIntranet = $.apiServerIntranet;
        this.masterPublicIp = $.masterPublicIp;
        this.serviceDomain = $.serviceDomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeKubernetesConnectionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeKubernetesConnectionsArgs $;

        public Builder() {
            $ = new EdgeKubernetesConnectionsArgs();
        }

        public Builder(EdgeKubernetesConnectionsArgs defaults) {
            $ = new EdgeKubernetesConnectionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiServerInternet API Server Internet endpoint.
         * 
         * @return builder
         * 
         */
        public Builder apiServerInternet(@Nullable Output<String> apiServerInternet) {
            $.apiServerInternet = apiServerInternet;
            return this;
        }

        /**
         * @param apiServerInternet API Server Internet endpoint.
         * 
         * @return builder
         * 
         */
        public Builder apiServerInternet(String apiServerInternet) {
            return apiServerInternet(Output.of(apiServerInternet));
        }

        /**
         * @param apiServerIntranet API Server Intranet endpoint.
         * 
         * @return builder
         * 
         */
        public Builder apiServerIntranet(@Nullable Output<String> apiServerIntranet) {
            $.apiServerIntranet = apiServerIntranet;
            return this;
        }

        /**
         * @param apiServerIntranet API Server Intranet endpoint.
         * 
         * @return builder
         * 
         */
        public Builder apiServerIntranet(String apiServerIntranet) {
            return apiServerIntranet(Output.of(apiServerIntranet));
        }

        /**
         * @param masterPublicIp Master node SSH IP address.
         * 
         * @return builder
         * 
         */
        public Builder masterPublicIp(@Nullable Output<String> masterPublicIp) {
            $.masterPublicIp = masterPublicIp;
            return this;
        }

        /**
         * @param masterPublicIp Master node SSH IP address.
         * 
         * @return builder
         * 
         */
        public Builder masterPublicIp(String masterPublicIp) {
            return masterPublicIp(Output.of(masterPublicIp));
        }

        /**
         * @param serviceDomain Service Access Domain.
         * 
         * @return builder
         * 
         */
        public Builder serviceDomain(@Nullable Output<String> serviceDomain) {
            $.serviceDomain = serviceDomain;
            return this;
        }

        /**
         * @param serviceDomain Service Access Domain.
         * 
         * @return builder
         * 
         */
        public Builder serviceDomain(String serviceDomain) {
            return serviceDomain(Output.of(serviceDomain));
        }

        public EdgeKubernetesConnectionsArgs build() {
            return $;
        }
    }

}
