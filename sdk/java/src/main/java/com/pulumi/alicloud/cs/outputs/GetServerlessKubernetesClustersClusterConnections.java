// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerlessKubernetesClustersClusterConnections {
    /**
     * @return API Server Internet endpoint.
     * 
     */
    private String apiServerInternet;
    /**
     * @return API Server Intranet endpoint.
     * 
     */
    private String apiServerIntranet;
    /**
     * @return Master node SSH IP address.
     * 
     */
    private String masterPublicIp;

    private GetServerlessKubernetesClustersClusterConnections() {}
    /**
     * @return API Server Internet endpoint.
     * 
     */
    public String apiServerInternet() {
        return this.apiServerInternet;
    }
    /**
     * @return API Server Intranet endpoint.
     * 
     */
    public String apiServerIntranet() {
        return this.apiServerIntranet;
    }
    /**
     * @return Master node SSH IP address.
     * 
     */
    public String masterPublicIp() {
        return this.masterPublicIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerlessKubernetesClustersClusterConnections defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiServerInternet;
        private String apiServerIntranet;
        private String masterPublicIp;
        public Builder() {}
        public Builder(GetServerlessKubernetesClustersClusterConnections defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiServerInternet = defaults.apiServerInternet;
    	      this.apiServerIntranet = defaults.apiServerIntranet;
    	      this.masterPublicIp = defaults.masterPublicIp;
        }

        @CustomType.Setter
        public Builder apiServerInternet(String apiServerInternet) {
            if (apiServerInternet == null) {
              throw new MissingRequiredPropertyException("GetServerlessKubernetesClustersClusterConnections", "apiServerInternet");
            }
            this.apiServerInternet = apiServerInternet;
            return this;
        }
        @CustomType.Setter
        public Builder apiServerIntranet(String apiServerIntranet) {
            if (apiServerIntranet == null) {
              throw new MissingRequiredPropertyException("GetServerlessKubernetesClustersClusterConnections", "apiServerIntranet");
            }
            this.apiServerIntranet = apiServerIntranet;
            return this;
        }
        @CustomType.Setter
        public Builder masterPublicIp(String masterPublicIp) {
            if (masterPublicIp == null) {
              throw new MissingRequiredPropertyException("GetServerlessKubernetesClustersClusterConnections", "masterPublicIp");
            }
            this.masterPublicIp = masterPublicIp;
            return this;
        }
        public GetServerlessKubernetesClustersClusterConnections build() {
            final var _resultValue = new GetServerlessKubernetesClustersClusterConnections();
            _resultValue.apiServerInternet = apiServerInternet;
            _resultValue.apiServerIntranet = apiServerIntranet;
            _resultValue.masterPublicIp = masterPublicIp;
            return _resultValue;
        }
    }
}