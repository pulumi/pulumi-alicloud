// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransitRouterPeerAttachmentsAttachment {
    /**
     * @return Auto publish route enabled.
     * 
     */
    private final Boolean autoPublishRouteEnabled;
    /**
     * @return The bandwidth of the bandwidth package.
     * 
     */
    private final Integer bandwidth;
    /**
     * @return ID of the CEN bandwidth package.
     * 
     */
    private final String cenBandwidthPackageId;
    /**
     * @return ID of the geographic.
     * 
     */
    private final String geographicSpanId;
    /**
     * @return The ID of CEN Transit Router peer attachments.
     * 
     */
    private final String id;
    /**
     * @return ID of the peer transit router.
     * 
     */
    private final String peerTransitRouterId;
    /**
     * @return Owner ID of the peer transit router.
     * 
     */
    private final String peerTransitRouterOwnerId;
    /**
     * @return Region ID of the peer transit router.
     * 
     */
    private final String peerTransitRouterRegionId;
    /**
     * @return Type of the resource.
     * 
     */
    private final String resourceType;
    /**
     * @return The status of CEN Transit Router peer attachment. Valid values `Attached`, `Attaching` and `Detaching`.
     * 
     */
    private final String status;
    /**
     * @return The description of CEN Transit Router peer attachments.
     * 
     */
    private final String transitRouterAttachmentDescription;
    /**
     * @return The ID of CEN Transit Router peer attachments.
     * 
     */
    private final String transitRouterAttachmentId;
    /**
     * @return Name of the transit router attachment.
     * 
     */
    private final String transitRouterAttachmentName;
    /**
     * @return The ID of transit router.
     * 
     */
    private final String transitRouterId;

    @CustomType.Constructor
    private GetTransitRouterPeerAttachmentsAttachment(
        @CustomType.Parameter("autoPublishRouteEnabled") Boolean autoPublishRouteEnabled,
        @CustomType.Parameter("bandwidth") Integer bandwidth,
        @CustomType.Parameter("cenBandwidthPackageId") String cenBandwidthPackageId,
        @CustomType.Parameter("geographicSpanId") String geographicSpanId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("peerTransitRouterId") String peerTransitRouterId,
        @CustomType.Parameter("peerTransitRouterOwnerId") String peerTransitRouterOwnerId,
        @CustomType.Parameter("peerTransitRouterRegionId") String peerTransitRouterRegionId,
        @CustomType.Parameter("resourceType") String resourceType,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("transitRouterAttachmentDescription") String transitRouterAttachmentDescription,
        @CustomType.Parameter("transitRouterAttachmentId") String transitRouterAttachmentId,
        @CustomType.Parameter("transitRouterAttachmentName") String transitRouterAttachmentName,
        @CustomType.Parameter("transitRouterId") String transitRouterId) {
        this.autoPublishRouteEnabled = autoPublishRouteEnabled;
        this.bandwidth = bandwidth;
        this.cenBandwidthPackageId = cenBandwidthPackageId;
        this.geographicSpanId = geographicSpanId;
        this.id = id;
        this.peerTransitRouterId = peerTransitRouterId;
        this.peerTransitRouterOwnerId = peerTransitRouterOwnerId;
        this.peerTransitRouterRegionId = peerTransitRouterRegionId;
        this.resourceType = resourceType;
        this.status = status;
        this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        this.transitRouterAttachmentName = transitRouterAttachmentName;
        this.transitRouterId = transitRouterId;
    }

    /**
     * @return Auto publish route enabled.
     * 
     */
    public Boolean autoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }
    /**
     * @return The bandwidth of the bandwidth package.
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return ID of the CEN bandwidth package.
     * 
     */
    public String cenBandwidthPackageId() {
        return this.cenBandwidthPackageId;
    }
    /**
     * @return ID of the geographic.
     * 
     */
    public String geographicSpanId() {
        return this.geographicSpanId;
    }
    /**
     * @return The ID of CEN Transit Router peer attachments.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ID of the peer transit router.
     * 
     */
    public String peerTransitRouterId() {
        return this.peerTransitRouterId;
    }
    /**
     * @return Owner ID of the peer transit router.
     * 
     */
    public String peerTransitRouterOwnerId() {
        return this.peerTransitRouterOwnerId;
    }
    /**
     * @return Region ID of the peer transit router.
     * 
     */
    public String peerTransitRouterRegionId() {
        return this.peerTransitRouterRegionId;
    }
    /**
     * @return Type of the resource.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return The status of CEN Transit Router peer attachment. Valid values `Attached`, `Attaching` and `Detaching`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The description of CEN Transit Router peer attachments.
     * 
     */
    public String transitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }
    /**
     * @return The ID of CEN Transit Router peer attachments.
     * 
     */
    public String transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }
    /**
     * @return Name of the transit router attachment.
     * 
     */
    public String transitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }
    /**
     * @return The ID of transit router.
     * 
     */
    public String transitRouterId() {
        return this.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRouterPeerAttachmentsAttachment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoPublishRouteEnabled;
        private Integer bandwidth;
        private String cenBandwidthPackageId;
        private String geographicSpanId;
        private String id;
        private String peerTransitRouterId;
        private String peerTransitRouterOwnerId;
        private String peerTransitRouterRegionId;
        private String resourceType;
        private String status;
        private String transitRouterAttachmentDescription;
        private String transitRouterAttachmentId;
        private String transitRouterAttachmentName;
        private String transitRouterId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitRouterPeerAttachmentsAttachment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPublishRouteEnabled = defaults.autoPublishRouteEnabled;
    	      this.bandwidth = defaults.bandwidth;
    	      this.cenBandwidthPackageId = defaults.cenBandwidthPackageId;
    	      this.geographicSpanId = defaults.geographicSpanId;
    	      this.id = defaults.id;
    	      this.peerTransitRouterId = defaults.peerTransitRouterId;
    	      this.peerTransitRouterOwnerId = defaults.peerTransitRouterOwnerId;
    	      this.peerTransitRouterRegionId = defaults.peerTransitRouterRegionId;
    	      this.resourceType = defaults.resourceType;
    	      this.status = defaults.status;
    	      this.transitRouterAttachmentDescription = defaults.transitRouterAttachmentDescription;
    	      this.transitRouterAttachmentId = defaults.transitRouterAttachmentId;
    	      this.transitRouterAttachmentName = defaults.transitRouterAttachmentName;
    	      this.transitRouterId = defaults.transitRouterId;
        }

        public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
            this.autoPublishRouteEnabled = Objects.requireNonNull(autoPublishRouteEnabled);
            return this;
        }
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        public Builder cenBandwidthPackageId(String cenBandwidthPackageId) {
            this.cenBandwidthPackageId = Objects.requireNonNull(cenBandwidthPackageId);
            return this;
        }
        public Builder geographicSpanId(String geographicSpanId) {
            this.geographicSpanId = Objects.requireNonNull(geographicSpanId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder peerTransitRouterId(String peerTransitRouterId) {
            this.peerTransitRouterId = Objects.requireNonNull(peerTransitRouterId);
            return this;
        }
        public Builder peerTransitRouterOwnerId(String peerTransitRouterOwnerId) {
            this.peerTransitRouterOwnerId = Objects.requireNonNull(peerTransitRouterOwnerId);
            return this;
        }
        public Builder peerTransitRouterRegionId(String peerTransitRouterRegionId) {
            this.peerTransitRouterRegionId = Objects.requireNonNull(peerTransitRouterRegionId);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            this.transitRouterAttachmentDescription = Objects.requireNonNull(transitRouterAttachmentDescription);
            return this;
        }
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = Objects.requireNonNull(transitRouterAttachmentId);
            return this;
        }
        public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
            this.transitRouterAttachmentName = Objects.requireNonNull(transitRouterAttachmentName);
            return this;
        }
        public Builder transitRouterId(String transitRouterId) {
            this.transitRouterId = Objects.requireNonNull(transitRouterId);
            return this;
        }        public GetTransitRouterPeerAttachmentsAttachment build() {
            return new GetTransitRouterPeerAttachmentsAttachment(autoPublishRouteEnabled, bandwidth, cenBandwidthPackageId, geographicSpanId, id, peerTransitRouterId, peerTransitRouterOwnerId, peerTransitRouterRegionId, resourceType, status, transitRouterAttachmentDescription, transitRouterAttachmentId, transitRouterAttachmentName, transitRouterId);
        }
    }
}