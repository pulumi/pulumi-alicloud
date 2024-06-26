// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransitRouterMulticastDomainAssociationsAssociation {
    /**
     * @return The ID of the Transit Router Multicast Domain Association. It formats as `&lt;transit_router_multicast_domain_id&gt;:&lt;transit_router_attachment_id&gt;:&lt;vswitch_id&gt;`.
     * 
     */
    private String id;
    /**
     * @return The ID of the resource associated with the multicast domain.
     * 
     */
    private String resourceId;
    /**
     * @return The ID of the Alibaba Cloud account to which the resource associated with the multicast domain belongs.
     * 
     */
    private Integer resourceOwnerId;
    /**
     * @return The type of resource associated with the multicast domain. Valid Value: `VPC`.
     * 
     */
    private String resourceType;
    /**
     * @return The status of the associated resource. Valid Value: `Associated`, `Associating`, `Dissociating`.
     * 
     */
    private String status;
    /**
     * @return The ID of the network instance connection.
     * 
     */
    private String transitRouterAttachmentId;
    /**
     * @return The ID of the multicast domain.
     * 
     */
    private String transitRouterMulticastDomainId;
    /**
     * @return The ID of the vSwitch.
     * 
     */
    private String vswitchId;

    private GetTransitRouterMulticastDomainAssociationsAssociation() {}
    /**
     * @return The ID of the Transit Router Multicast Domain Association. It formats as `&lt;transit_router_multicast_domain_id&gt;:&lt;transit_router_attachment_id&gt;:&lt;vswitch_id&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the resource associated with the multicast domain.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * @return The ID of the Alibaba Cloud account to which the resource associated with the multicast domain belongs.
     * 
     */
    public Integer resourceOwnerId() {
        return this.resourceOwnerId;
    }
    /**
     * @return The type of resource associated with the multicast domain. Valid Value: `VPC`.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return The status of the associated resource. Valid Value: `Associated`, `Associating`, `Dissociating`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the network instance connection.
     * 
     */
    public String transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }
    /**
     * @return The ID of the multicast domain.
     * 
     */
    public String transitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }
    /**
     * @return The ID of the vSwitch.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRouterMulticastDomainAssociationsAssociation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String resourceId;
        private Integer resourceOwnerId;
        private String resourceType;
        private String status;
        private String transitRouterAttachmentId;
        private String transitRouterMulticastDomainId;
        private String vswitchId;
        public Builder() {}
        public Builder(GetTransitRouterMulticastDomainAssociationsAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceOwnerId = defaults.resourceOwnerId;
    	      this.resourceType = defaults.resourceType;
    	      this.status = defaults.status;
    	      this.transitRouterAttachmentId = defaults.transitRouterAttachmentId;
    	      this.transitRouterMulticastDomainId = defaults.transitRouterMulticastDomainId;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainAssociationsAssociation", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder resourceId(String resourceId) {
            if (resourceId == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainAssociationsAssociation", "resourceId");
            }
            this.resourceId = resourceId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceOwnerId(Integer resourceOwnerId) {
            if (resourceOwnerId == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainAssociationsAssociation", "resourceOwnerId");
            }
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(String resourceType) {
            if (resourceType == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainAssociationsAssociation", "resourceType");
            }
            this.resourceType = resourceType;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainAssociationsAssociation", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            if (transitRouterAttachmentId == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainAssociationsAssociation", "transitRouterAttachmentId");
            }
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            if (transitRouterMulticastDomainId == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainAssociationsAssociation", "transitRouterMulticastDomainId");
            }
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            if (vswitchId == null) {
              throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainAssociationsAssociation", "vswitchId");
            }
            this.vswitchId = vswitchId;
            return this;
        }
        public GetTransitRouterMulticastDomainAssociationsAssociation build() {
            final var _resultValue = new GetTransitRouterMulticastDomainAssociationsAssociation();
            _resultValue.id = id;
            _resultValue.resourceId = resourceId;
            _resultValue.resourceOwnerId = resourceOwnerId;
            _resultValue.resourceType = resourceType;
            _resultValue.status = status;
            _resultValue.transitRouterAttachmentId = transitRouterAttachmentId;
            _resultValue.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            _resultValue.vswitchId = vswitchId;
            return _resultValue;
        }
    }
}
