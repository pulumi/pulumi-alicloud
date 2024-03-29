// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetChildInstanceRouteEntryToAttachmentsAttachment;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetChildInstanceRouteEntryToAttachmentsResult {
    /**
     * @return A list of Child Instance Route Entry To Attachment Entries. Each element contains the following attributes:
     * 
     */
    private List<GetChildInstanceRouteEntryToAttachmentsAttachment> attachments;
    /**
     * @return The ID of the CEN instance.
     * 
     */
    private @Nullable String cenId;
    /**
     * @return The first ID of the resource
     * 
     */
    private String childInstanceRouteTableId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Limit search to a list of specific IDs.The value is formulated as `&lt;cen_id&gt;:&lt;child_instance_route_table_id&gt;:&lt;transit_router_attachment_id&gt;:&lt;destination_cidr_block&gt;`.
     * 
     */
    private List<String> ids;
    private @Nullable String outputFile;
    /**
     * @return ServiceType
     * 
     */
    private @Nullable String serviceType;
    /**
     * @return TransitRouterAttachmentId
     * 
     */
    private String transitRouterAttachmentId;

    private GetChildInstanceRouteEntryToAttachmentsResult() {}
    /**
     * @return A list of Child Instance Route Entry To Attachment Entries. Each element contains the following attributes:
     * 
     */
    public List<GetChildInstanceRouteEntryToAttachmentsAttachment> attachments() {
        return this.attachments;
    }
    /**
     * @return The ID of the CEN instance.
     * 
     */
    public Optional<String> cenId() {
        return Optional.ofNullable(this.cenId);
    }
    /**
     * @return The first ID of the resource
     * 
     */
    public String childInstanceRouteTableId() {
        return this.childInstanceRouteTableId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Limit search to a list of specific IDs.The value is formulated as `&lt;cen_id&gt;:&lt;child_instance_route_table_id&gt;:&lt;transit_router_attachment_id&gt;:&lt;destination_cidr_block&gt;`.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return ServiceType
     * 
     */
    public Optional<String> serviceType() {
        return Optional.ofNullable(this.serviceType);
    }
    /**
     * @return TransitRouterAttachmentId
     * 
     */
    public String transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChildInstanceRouteEntryToAttachmentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetChildInstanceRouteEntryToAttachmentsAttachment> attachments;
        private @Nullable String cenId;
        private String childInstanceRouteTableId;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private @Nullable String serviceType;
        private String transitRouterAttachmentId;
        public Builder() {}
        public Builder(GetChildInstanceRouteEntryToAttachmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachments = defaults.attachments;
    	      this.cenId = defaults.cenId;
    	      this.childInstanceRouteTableId = defaults.childInstanceRouteTableId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.serviceType = defaults.serviceType;
    	      this.transitRouterAttachmentId = defaults.transitRouterAttachmentId;
        }

        @CustomType.Setter
        public Builder attachments(List<GetChildInstanceRouteEntryToAttachmentsAttachment> attachments) {
            if (attachments == null) {
              throw new MissingRequiredPropertyException("GetChildInstanceRouteEntryToAttachmentsResult", "attachments");
            }
            this.attachments = attachments;
            return this;
        }
        public Builder attachments(GetChildInstanceRouteEntryToAttachmentsAttachment... attachments) {
            return attachments(List.of(attachments));
        }
        @CustomType.Setter
        public Builder cenId(@Nullable String cenId) {

            this.cenId = cenId;
            return this;
        }
        @CustomType.Setter
        public Builder childInstanceRouteTableId(String childInstanceRouteTableId) {
            if (childInstanceRouteTableId == null) {
              throw new MissingRequiredPropertyException("GetChildInstanceRouteEntryToAttachmentsResult", "childInstanceRouteTableId");
            }
            this.childInstanceRouteTableId = childInstanceRouteTableId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetChildInstanceRouteEntryToAttachmentsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetChildInstanceRouteEntryToAttachmentsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder serviceType(@Nullable String serviceType) {

            this.serviceType = serviceType;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            if (transitRouterAttachmentId == null) {
              throw new MissingRequiredPropertyException("GetChildInstanceRouteEntryToAttachmentsResult", "transitRouterAttachmentId");
            }
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public GetChildInstanceRouteEntryToAttachmentsResult build() {
            final var _resultValue = new GetChildInstanceRouteEntryToAttachmentsResult();
            _resultValue.attachments = attachments;
            _resultValue.cenId = cenId;
            _resultValue.childInstanceRouteTableId = childInstanceRouteTableId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.outputFile = outputFile;
            _resultValue.serviceType = serviceType;
            _resultValue.transitRouterAttachmentId = transitRouterAttachmentId;
            return _resultValue;
        }
    }
}
