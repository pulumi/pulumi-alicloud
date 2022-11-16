// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class HAVipAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final HAVipAttachmentArgs Empty = new HAVipAttachmentArgs();

    /**
     * The havip_id of the havip attachment, the field can&#39;t be changed.
     * 
     */
    @Import(name="havipId", required=true)
    private Output<String> havipId;

    /**
     * @return The havip_id of the havip attachment, the field can&#39;t be changed.
     * 
     */
    public Output<String> havipId() {
        return this.havipId;
    }

    /**
     * The instance_id of the havip attachment, the field can&#39;t be changed.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The instance_id of the havip attachment, the field can&#39;t be changed.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    private HAVipAttachmentArgs() {}

    private HAVipAttachmentArgs(HAVipAttachmentArgs $) {
        this.havipId = $.havipId;
        this.instanceId = $.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HAVipAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HAVipAttachmentArgs $;

        public Builder() {
            $ = new HAVipAttachmentArgs();
        }

        public Builder(HAVipAttachmentArgs defaults) {
            $ = new HAVipAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param havipId The havip_id of the havip attachment, the field can&#39;t be changed.
         * 
         * @return builder
         * 
         */
        public Builder havipId(Output<String> havipId) {
            $.havipId = havipId;
            return this;
        }

        /**
         * @param havipId The havip_id of the havip attachment, the field can&#39;t be changed.
         * 
         * @return builder
         * 
         */
        public Builder havipId(String havipId) {
            return havipId(Output.of(havipId));
        }

        /**
         * @param instanceId The instance_id of the havip attachment, the field can&#39;t be changed.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The instance_id of the havip attachment, the field can&#39;t be changed.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public HAVipAttachmentArgs build() {
            $.havipId = Objects.requireNonNull($.havipId, "expected parameter 'havipId' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}