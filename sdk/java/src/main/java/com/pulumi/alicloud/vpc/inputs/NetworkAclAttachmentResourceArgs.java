// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class NetworkAclAttachmentResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAclAttachmentResourceArgs Empty = new NetworkAclAttachmentResourceArgs();

    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    public Output<String> resourceType() {
        return this.resourceType;
    }

    private NetworkAclAttachmentResourceArgs() {}

    private NetworkAclAttachmentResourceArgs(NetworkAclAttachmentResourceArgs $) {
        this.resourceId = $.resourceId;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAclAttachmentResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAclAttachmentResourceArgs $;

        public Builder() {
            $ = new NetworkAclAttachmentResourceArgs();
        }

        public Builder(NetworkAclAttachmentResourceArgs defaults) {
            $ = new NetworkAclAttachmentResourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public NetworkAclAttachmentResourceArgs build() {
            if ($.resourceId == null) {
                throw new MissingRequiredPropertyException("NetworkAclAttachmentResourceArgs", "resourceId");
            }
            if ($.resourceType == null) {
                throw new MissingRequiredPropertyException("NetworkAclAttachmentResourceArgs", "resourceType");
            }
            return $;
        }
    }

}