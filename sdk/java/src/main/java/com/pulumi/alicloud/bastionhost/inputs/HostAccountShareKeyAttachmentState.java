// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostAccountShareKeyAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final HostAccountShareKeyAttachmentState Empty = new HostAccountShareKeyAttachmentState();

    /**
     * The ID list of the host account.
     * 
     */
    @Import(name="hostAccountId")
    private @Nullable Output<String> hostAccountId;

    /**
     * @return The ID list of the host account.
     * 
     */
    public Optional<Output<String>> hostAccountId() {
        return Optional.ofNullable(this.hostAccountId);
    }

    /**
     * The ID of the host shared key.
     * 
     */
    @Import(name="hostShareKeyId")
    private @Nullable Output<String> hostShareKeyId;

    /**
     * @return The ID of the host shared key.
     * 
     */
    public Optional<Output<String>> hostShareKeyId() {
        return Optional.ofNullable(this.hostShareKeyId);
    }

    /**
     * The ID of the Bastion machine instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The ID of the Bastion machine instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    private HostAccountShareKeyAttachmentState() {}

    private HostAccountShareKeyAttachmentState(HostAccountShareKeyAttachmentState $) {
        this.hostAccountId = $.hostAccountId;
        this.hostShareKeyId = $.hostShareKeyId;
        this.instanceId = $.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAccountShareKeyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAccountShareKeyAttachmentState $;

        public Builder() {
            $ = new HostAccountShareKeyAttachmentState();
        }

        public Builder(HostAccountShareKeyAttachmentState defaults) {
            $ = new HostAccountShareKeyAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostAccountId The ID list of the host account.
         * 
         * @return builder
         * 
         */
        public Builder hostAccountId(@Nullable Output<String> hostAccountId) {
            $.hostAccountId = hostAccountId;
            return this;
        }

        /**
         * @param hostAccountId The ID list of the host account.
         * 
         * @return builder
         * 
         */
        public Builder hostAccountId(String hostAccountId) {
            return hostAccountId(Output.of(hostAccountId));
        }

        /**
         * @param hostShareKeyId The ID of the host shared key.
         * 
         * @return builder
         * 
         */
        public Builder hostShareKeyId(@Nullable Output<String> hostShareKeyId) {
            $.hostShareKeyId = hostShareKeyId;
            return this;
        }

        /**
         * @param hostShareKeyId The ID of the host shared key.
         * 
         * @return builder
         * 
         */
        public Builder hostShareKeyId(String hostShareKeyId) {
            return hostShareKeyId(Output.of(hostShareKeyId));
        }

        /**
         * @param instanceId The ID of the Bastion machine instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the Bastion machine instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public HostAccountShareKeyAttachmentState build() {
            return $;
        }
    }

}
