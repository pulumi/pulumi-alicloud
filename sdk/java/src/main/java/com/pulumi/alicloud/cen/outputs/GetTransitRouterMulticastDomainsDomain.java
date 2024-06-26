// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransitRouterMulticastDomainsDomain {
    /**
     * @return The ID of the Transit Router Multicast Domain.
     * 
     */
    private String id;
    /**
     * @return The status of the multicast domain. Valid Value: `Active`.
     * 
     */
    private String status;
    /**
     * @return The ID of the transit router.
     * 
     */
    private String transitRouterId;
    /**
     * @return The description of the Transit Router Multicast Domain.
     * 
     */
    private String transitRouterMulticastDomainDescription;
    /**
     * @return The ID of the multicast domain.
     * 
     */
    private String transitRouterMulticastDomainId;
    /**
     * @return The name of the Transit Router Multicast Domain.
     * 
     */
    private String transitRouterMulticastDomainName;

    private GetTransitRouterMulticastDomainsDomain() {}
    /**
     * @return The ID of the Transit Router Multicast Domain.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The status of the multicast domain. Valid Value: `Active`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the transit router.
     * 
     */
    public String transitRouterId() {
        return this.transitRouterId;
    }
    /**
     * @return The description of the Transit Router Multicast Domain.
     * 
     */
    public String transitRouterMulticastDomainDescription() {
        return this.transitRouterMulticastDomainDescription;
    }
    /**
     * @return The ID of the multicast domain.
     * 
     */
    public String transitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }
    /**
     * @return The name of the Transit Router Multicast Domain.
     * 
     */
    public String transitRouterMulticastDomainName() {
        return this.transitRouterMulticastDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRouterMulticastDomainsDomain defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String status;
        private String transitRouterId;
        private String transitRouterMulticastDomainDescription;
        private String transitRouterMulticastDomainId;
        private String transitRouterMulticastDomainName;
        public Builder() {}
        public Builder(GetTransitRouterMulticastDomainsDomain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.status = defaults.status;
    	      this.transitRouterId = defaults.transitRouterId;
    	      this.transitRouterMulticastDomainDescription = defaults.transitRouterMulticastDomainDescription;
    	      this.transitRouterMulticastDomainId = defaults.transitRouterMulticastDomainId;
    	      this.transitRouterMulticastDomainName = defaults.transitRouterMulticastDomainName;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainsDomain", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainsDomain", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterId(String transitRouterId) {
            if (transitRouterId == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainsDomain", "transitRouterId");
            }
            this.transitRouterId = transitRouterId;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
            if (transitRouterMulticastDomainDescription == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainsDomain", "transitRouterMulticastDomainDescription");
            }
            this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            if (transitRouterMulticastDomainId == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainsDomain", "transitRouterMulticastDomainId");
            }
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterMulticastDomainName(String transitRouterMulticastDomainName) {
            if (transitRouterMulticastDomainName == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainsDomain", "transitRouterMulticastDomainName");
            }
            this.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
            return this;
        }
        public GetTransitRouterMulticastDomainsDomain build() {
            final var _resultValue = new GetTransitRouterMulticastDomainsDomain();
            _resultValue.id = id;
            _resultValue.status = status;
            _resultValue.transitRouterId = transitRouterId;
            _resultValue.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
            _resultValue.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            _resultValue.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
            return _resultValue;
        }
    }
}
