// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyPairAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final KeyPairAttachmentState Empty = new KeyPairAttachmentState();

    /**
     * Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * The list of ECS instance&#39;s IDs.
     * 
     */
    @Import(name="instanceIds")
    private @Nullable Output<List<String>> instanceIds;

    /**
     * @return The list of ECS instance&#39;s IDs.
     * 
     */
    public Optional<Output<List<String>>> instanceIds() {
        return Optional.ofNullable(this.instanceIds);
    }

    /**
     * The name of key pair used to bind.
     * 
     * @deprecated
     * Field &#39;key_name&#39; has been deprecated from provider version 1.121.0. New field &#39;key_pair_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead. */
    @Import(name="keyName")
    private @Nullable Output<String> keyName;

    /**
     * @return The name of key pair used to bind.
     * 
     * @deprecated
     * Field &#39;key_name&#39; has been deprecated from provider version 1.121.0. New field &#39;key_pair_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead. */
    public Optional<Output<String>> keyName() {
        return Optional.ofNullable(this.keyName);
    }

    @Import(name="keyPairName")
    private @Nullable Output<String> keyPairName;

    public Optional<Output<String>> keyPairName() {
        return Optional.ofNullable(this.keyPairName);
    }

    private KeyPairAttachmentState() {}

    private KeyPairAttachmentState(KeyPairAttachmentState $) {
        this.force = $.force;
        this.instanceIds = $.instanceIds;
        this.keyName = $.keyName;
        this.keyPairName = $.keyPairName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyPairAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyPairAttachmentState $;

        public Builder() {
            $ = new KeyPairAttachmentState();
        }

        public Builder(KeyPairAttachmentState defaults) {
            $ = new KeyPairAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param force Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param instanceIds The list of ECS instance&#39;s IDs.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(@Nullable Output<List<String>> instanceIds) {
            $.instanceIds = instanceIds;
            return this;
        }

        /**
         * @param instanceIds The list of ECS instance&#39;s IDs.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(List<String> instanceIds) {
            return instanceIds(Output.of(instanceIds));
        }

        /**
         * @param instanceIds The list of ECS instance&#39;s IDs.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(String... instanceIds) {
            return instanceIds(List.of(instanceIds));
        }

        /**
         * @param keyName The name of key pair used to bind.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;key_name&#39; has been deprecated from provider version 1.121.0. New field &#39;key_pair_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead. */
        public Builder keyName(@Nullable Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keyName The name of key pair used to bind.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;key_name&#39; has been deprecated from provider version 1.121.0. New field &#39;key_pair_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'key_name' has been deprecated from provider version 1.121.0. New field 'key_pair_name' instead. */
        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        public Builder keyPairName(@Nullable Output<String> keyPairName) {
            $.keyPairName = keyPairName;
            return this;
        }

        public Builder keyPairName(String keyPairName) {
            return keyPairName(Output.of(keyPairName));
        }

        public KeyPairAttachmentState build() {
            return $;
        }
    }

}
