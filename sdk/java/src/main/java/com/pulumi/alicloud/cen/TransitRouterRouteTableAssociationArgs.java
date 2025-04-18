// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitRouterRouteTableAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransitRouterRouteTableAssociationArgs Empty = new TransitRouterRouteTableAssociationArgs();

    /**
     * Whether to perform PreCheck on this request, including permissions and instance status verification. Value:
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Whether to perform PreCheck on this request, including permissions and instance status verification. Value:
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * TransitRouterAttachmentId
     * 
     */
    @Import(name="transitRouterAttachmentId", required=true)
    private Output<String> transitRouterAttachmentId;

    /**
     * @return TransitRouterAttachmentId
     * 
     */
    public Output<String> transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    /**
     * TransitRouterRouteTableId
     * 
     */
    @Import(name="transitRouterRouteTableId", required=true)
    private Output<String> transitRouterRouteTableId;

    /**
     * @return TransitRouterRouteTableId
     * 
     */
    public Output<String> transitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    private TransitRouterRouteTableAssociationArgs() {}

    private TransitRouterRouteTableAssociationArgs(TransitRouterRouteTableAssociationArgs $) {
        this.dryRun = $.dryRun;
        this.transitRouterAttachmentId = $.transitRouterAttachmentId;
        this.transitRouterRouteTableId = $.transitRouterRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitRouterRouteTableAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitRouterRouteTableAssociationArgs $;

        public Builder() {
            $ = new TransitRouterRouteTableAssociationArgs();
        }

        public Builder(TransitRouterRouteTableAssociationArgs defaults) {
            $ = new TransitRouterRouteTableAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dryRun Whether to perform PreCheck on this request, including permissions and instance status verification. Value:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Whether to perform PreCheck on this request, including permissions and instance status verification. Value:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param transitRouterAttachmentId TransitRouterAttachmentId
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentId(Output<String> transitRouterAttachmentId) {
            $.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * @param transitRouterAttachmentId TransitRouterAttachmentId
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            return transitRouterAttachmentId(Output.of(transitRouterAttachmentId));
        }

        /**
         * @param transitRouterRouteTableId TransitRouterRouteTableId
         * 
         * @return builder
         * 
         */
        public Builder transitRouterRouteTableId(Output<String> transitRouterRouteTableId) {
            $.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        /**
         * @param transitRouterRouteTableId TransitRouterRouteTableId
         * 
         * @return builder
         * 
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            return transitRouterRouteTableId(Output.of(transitRouterRouteTableId));
        }

        public TransitRouterRouteTableAssociationArgs build() {
            if ($.transitRouterAttachmentId == null) {
                throw new MissingRequiredPropertyException("TransitRouterRouteTableAssociationArgs", "transitRouterAttachmentId");
            }
            if ($.transitRouterRouteTableId == null) {
                throw new MissingRequiredPropertyException("TransitRouterRouteTableAssociationArgs", "transitRouterRouteTableId");
            }
            return $;
        }
    }

}
