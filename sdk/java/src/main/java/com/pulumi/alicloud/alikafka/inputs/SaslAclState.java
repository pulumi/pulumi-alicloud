// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alikafka.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SaslAclState extends com.pulumi.resources.ResourceArgs {

    public static final SaslAclState Empty = new SaslAclState();

    /**
     * Operation type for this acl. The operation type can only be &#34;Write&#34; and &#34;Read&#34;.
     * 
     */
    @Import(name="aclOperationType")
    private @Nullable Output<String> aclOperationType;

    /**
     * @return Operation type for this acl. The operation type can only be &#34;Write&#34; and &#34;Read&#34;.
     * 
     */
    public Optional<Output<String>> aclOperationType() {
        return Optional.ofNullable(this.aclOperationType);
    }

    /**
     * Resource name for this acl. The resource name should be a topic or consumer group name.
     * 
     */
    @Import(name="aclResourceName")
    private @Nullable Output<String> aclResourceName;

    /**
     * @return Resource name for this acl. The resource name should be a topic or consumer group name.
     * 
     */
    public Optional<Output<String>> aclResourceName() {
        return Optional.ofNullable(this.aclResourceName);
    }

    /**
     * Resource pattern type for this acl. The resource pattern support two types &#34;LITERAL&#34; and &#34;PREFIXED&#34;. &#34;LITERAL&#34;: A literal name defines the full name of a resource. The special wildcard character &#34;*&#34; can be used to represent a resource with any name. &#34;PREFIXED&#34;: A prefixed name defines a prefix for a resource.
     * 
     */
    @Import(name="aclResourcePatternType")
    private @Nullable Output<String> aclResourcePatternType;

    /**
     * @return Resource pattern type for this acl. The resource pattern support two types &#34;LITERAL&#34; and &#34;PREFIXED&#34;. &#34;LITERAL&#34;: A literal name defines the full name of a resource. The special wildcard character &#34;*&#34; can be used to represent a resource with any name. &#34;PREFIXED&#34;: A prefixed name defines a prefix for a resource.
     * 
     */
    public Optional<Output<String>> aclResourcePatternType() {
        return Optional.ofNullable(this.aclResourcePatternType);
    }

    /**
     * Resource type for this acl. The resource type can only be &#34;Topic&#34; and &#34;Group&#34;.
     * 
     */
    @Import(name="aclResourceType")
    private @Nullable Output<String> aclResourceType;

    /**
     * @return Resource type for this acl. The resource type can only be &#34;Topic&#34; and &#34;Group&#34;.
     * 
     */
    public Optional<Output<String>> aclResourceType() {
        return Optional.ofNullable(this.aclResourceType);
    }

    /**
     * The host of the acl.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The host of the acl.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * ID of the ALIKAFKA Instance that owns the groups.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return ID of the ALIKAFKA Instance that owns the groups.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Username for the sasl user. The length should between 1 to 64 characters. The user should be an existed sasl user.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username for the sasl user. The length should between 1 to 64 characters. The user should be an existed sasl user.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private SaslAclState() {}

    private SaslAclState(SaslAclState $) {
        this.aclOperationType = $.aclOperationType;
        this.aclResourceName = $.aclResourceName;
        this.aclResourcePatternType = $.aclResourcePatternType;
        this.aclResourceType = $.aclResourceType;
        this.host = $.host;
        this.instanceId = $.instanceId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SaslAclState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SaslAclState $;

        public Builder() {
            $ = new SaslAclState();
        }

        public Builder(SaslAclState defaults) {
            $ = new SaslAclState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclOperationType Operation type for this acl. The operation type can only be &#34;Write&#34; and &#34;Read&#34;.
         * 
         * @return builder
         * 
         */
        public Builder aclOperationType(@Nullable Output<String> aclOperationType) {
            $.aclOperationType = aclOperationType;
            return this;
        }

        /**
         * @param aclOperationType Operation type for this acl. The operation type can only be &#34;Write&#34; and &#34;Read&#34;.
         * 
         * @return builder
         * 
         */
        public Builder aclOperationType(String aclOperationType) {
            return aclOperationType(Output.of(aclOperationType));
        }

        /**
         * @param aclResourceName Resource name for this acl. The resource name should be a topic or consumer group name.
         * 
         * @return builder
         * 
         */
        public Builder aclResourceName(@Nullable Output<String> aclResourceName) {
            $.aclResourceName = aclResourceName;
            return this;
        }

        /**
         * @param aclResourceName Resource name for this acl. The resource name should be a topic or consumer group name.
         * 
         * @return builder
         * 
         */
        public Builder aclResourceName(String aclResourceName) {
            return aclResourceName(Output.of(aclResourceName));
        }

        /**
         * @param aclResourcePatternType Resource pattern type for this acl. The resource pattern support two types &#34;LITERAL&#34; and &#34;PREFIXED&#34;. &#34;LITERAL&#34;: A literal name defines the full name of a resource. The special wildcard character &#34;*&#34; can be used to represent a resource with any name. &#34;PREFIXED&#34;: A prefixed name defines a prefix for a resource.
         * 
         * @return builder
         * 
         */
        public Builder aclResourcePatternType(@Nullable Output<String> aclResourcePatternType) {
            $.aclResourcePatternType = aclResourcePatternType;
            return this;
        }

        /**
         * @param aclResourcePatternType Resource pattern type for this acl. The resource pattern support two types &#34;LITERAL&#34; and &#34;PREFIXED&#34;. &#34;LITERAL&#34;: A literal name defines the full name of a resource. The special wildcard character &#34;*&#34; can be used to represent a resource with any name. &#34;PREFIXED&#34;: A prefixed name defines a prefix for a resource.
         * 
         * @return builder
         * 
         */
        public Builder aclResourcePatternType(String aclResourcePatternType) {
            return aclResourcePatternType(Output.of(aclResourcePatternType));
        }

        /**
         * @param aclResourceType Resource type for this acl. The resource type can only be &#34;Topic&#34; and &#34;Group&#34;.
         * 
         * @return builder
         * 
         */
        public Builder aclResourceType(@Nullable Output<String> aclResourceType) {
            $.aclResourceType = aclResourceType;
            return this;
        }

        /**
         * @param aclResourceType Resource type for this acl. The resource type can only be &#34;Topic&#34; and &#34;Group&#34;.
         * 
         * @return builder
         * 
         */
        public Builder aclResourceType(String aclResourceType) {
            return aclResourceType(Output.of(aclResourceType));
        }

        /**
         * @param host The host of the acl.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The host of the acl.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param instanceId ID of the ALIKAFKA Instance that owns the groups.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId ID of the ALIKAFKA Instance that owns the groups.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param username Username for the sasl user. The length should between 1 to 64 characters. The user should be an existed sasl user.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username for the sasl user. The length should between 1 to 64 characters. The user should be an existed sasl user.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public SaslAclState build() {
            return $;
        }
    }

}