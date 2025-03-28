// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryEnterpriseSyncRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryEnterpriseSyncRuleArgs Empty = new RegistryEnterpriseSyncRuleArgs();

    /**
     * The ID of the Container Registry source instance.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The ID of the Container Registry source instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * Field `name` has been deprecated from provider version 1.240.0. New field `sync_rule_name` instead.
     * 
     * @deprecated
     * Field `name` has been deprecated from provider version 1.240.0. New field `sync_rule_name` instead.
     * 
     */
    @Deprecated /* Field `name` has been deprecated from provider version 1.240.0. New field `sync_rule_name` instead. */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Field `name` has been deprecated from provider version 1.240.0. New field `sync_rule_name` instead.
     * 
     * @deprecated
     * Field `name` has been deprecated from provider version 1.240.0. New field `sync_rule_name` instead.
     * 
     */
    @Deprecated /* Field `name` has been deprecated from provider version 1.240.0. New field `sync_rule_name` instead. */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The namespace name of the source instance.
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return The namespace name of the source instance.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * The image repository name of the source instance.
     * 
     */
    @Import(name="repoName")
    private @Nullable Output<String> repoName;

    /**
     * @return The image repository name of the source instance.
     * 
     */
    public Optional<Output<String>> repoName() {
        return Optional.ofNullable(this.repoName);
    }

    /**
     * The name of the sync rule.
     * 
     */
    @Import(name="syncRuleName")
    private @Nullable Output<String> syncRuleName;

    /**
     * @return The name of the sync rule.
     * 
     */
    public Optional<Output<String>> syncRuleName() {
        return Optional.ofNullable(this.syncRuleName);
    }

    /**
     * The synchronization scope. Valid values:
     * - `REPO`: Encrypts or decrypts data.
     * - `NAMESPACE`: Generates or verifies a digital signature.
     * &gt; **NOTE:** From version 1.240.0, `sync_scope` can be set.
     * 
     */
    @Import(name="syncScope")
    private @Nullable Output<String> syncScope;

    /**
     * @return The synchronization scope. Valid values:
     * - `REPO`: Encrypts or decrypts data.
     * - `NAMESPACE`: Generates or verifies a digital signature.
     * &gt; **NOTE:** From version 1.240.0, `sync_scope` can be set.
     * 
     */
    public Optional<Output<String>> syncScope() {
        return Optional.ofNullable(this.syncScope);
    }

    /**
     * The policy configured to trigger the synchronization rule. Default value: `PASSIVE`. Valid values:
     * - `INITIATIVE`: Manually triggers the synchronization rule.
     * - `PASSIVE`: Automatically triggers the synchronization rule.
     * 
     */
    @Import(name="syncTrigger")
    private @Nullable Output<String> syncTrigger;

    /**
     * @return The policy configured to trigger the synchronization rule. Default value: `PASSIVE`. Valid values:
     * - `INITIATIVE`: Manually triggers the synchronization rule.
     * - `PASSIVE`: Automatically triggers the synchronization rule.
     * 
     */
    public Optional<Output<String>> syncTrigger() {
        return Optional.ofNullable(this.syncTrigger);
    }

    /**
     * The regular expression used to filter image tags.
     * 
     */
    @Import(name="tagFilter", required=true)
    private Output<String> tagFilter;

    /**
     * @return The regular expression used to filter image tags.
     * 
     */
    public Output<String> tagFilter() {
        return this.tagFilter;
    }

    /**
     * The ID of the destination instance.
     * 
     */
    @Import(name="targetInstanceId", required=true)
    private Output<String> targetInstanceId;

    /**
     * @return The ID of the destination instance.
     * 
     */
    public Output<String> targetInstanceId() {
        return this.targetInstanceId;
    }

    /**
     * The namespace name of the destination instance.
     * 
     */
    @Import(name="targetNamespaceName", required=true)
    private Output<String> targetNamespaceName;

    /**
     * @return The namespace name of the destination instance.
     * 
     */
    public Output<String> targetNamespaceName() {
        return this.targetNamespaceName;
    }

    /**
     * The region ID of the destination instance.
     * 
     */
    @Import(name="targetRegionId", required=true)
    private Output<String> targetRegionId;

    /**
     * @return The region ID of the destination instance.
     * 
     */
    public Output<String> targetRegionId() {
        return this.targetRegionId;
    }

    /**
     * The image repository name of the destination instance.
     * 
     */
    @Import(name="targetRepoName")
    private @Nullable Output<String> targetRepoName;

    /**
     * @return The image repository name of the destination instance.
     * 
     */
    public Optional<Output<String>> targetRepoName() {
        return Optional.ofNullable(this.targetRepoName);
    }

    /**
     * The UID of the account to which the target instance belongs.
     * 
     */
    @Import(name="targetUserId")
    private @Nullable Output<String> targetUserId;

    /**
     * @return The UID of the account to which the target instance belongs.
     * 
     */
    public Optional<Output<String>> targetUserId() {
        return Optional.ofNullable(this.targetUserId);
    }

    private RegistryEnterpriseSyncRuleArgs() {}

    private RegistryEnterpriseSyncRuleArgs(RegistryEnterpriseSyncRuleArgs $) {
        this.instanceId = $.instanceId;
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.repoName = $.repoName;
        this.syncRuleName = $.syncRuleName;
        this.syncScope = $.syncScope;
        this.syncTrigger = $.syncTrigger;
        this.tagFilter = $.tagFilter;
        this.targetInstanceId = $.targetInstanceId;
        this.targetNamespaceName = $.targetNamespaceName;
        this.targetRegionId = $.targetRegionId;
        this.targetRepoName = $.targetRepoName;
        this.targetUserId = $.targetUserId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryEnterpriseSyncRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryEnterpriseSyncRuleArgs $;

        public Builder() {
            $ = new RegistryEnterpriseSyncRuleArgs();
        }

        public Builder(RegistryEnterpriseSyncRuleArgs defaults) {
            $ = new RegistryEnterpriseSyncRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId The ID of the Container Registry source instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the Container Registry source instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param name Field `name` has been deprecated from provider version 1.240.0. New field `sync_rule_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field `name` has been deprecated from provider version 1.240.0. New field `sync_rule_name` instead.
         * 
         */
        @Deprecated /* Field `name` has been deprecated from provider version 1.240.0. New field `sync_rule_name` instead. */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Field `name` has been deprecated from provider version 1.240.0. New field `sync_rule_name` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field `name` has been deprecated from provider version 1.240.0. New field `sync_rule_name` instead.
         * 
         */
        @Deprecated /* Field `name` has been deprecated from provider version 1.240.0. New field `sync_rule_name` instead. */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceName The namespace name of the source instance.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The namespace name of the source instance.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param repoName The image repository name of the source instance.
         * 
         * @return builder
         * 
         */
        public Builder repoName(@Nullable Output<String> repoName) {
            $.repoName = repoName;
            return this;
        }

        /**
         * @param repoName The image repository name of the source instance.
         * 
         * @return builder
         * 
         */
        public Builder repoName(String repoName) {
            return repoName(Output.of(repoName));
        }

        /**
         * @param syncRuleName The name of the sync rule.
         * 
         * @return builder
         * 
         */
        public Builder syncRuleName(@Nullable Output<String> syncRuleName) {
            $.syncRuleName = syncRuleName;
            return this;
        }

        /**
         * @param syncRuleName The name of the sync rule.
         * 
         * @return builder
         * 
         */
        public Builder syncRuleName(String syncRuleName) {
            return syncRuleName(Output.of(syncRuleName));
        }

        /**
         * @param syncScope The synchronization scope. Valid values:
         * - `REPO`: Encrypts or decrypts data.
         * - `NAMESPACE`: Generates or verifies a digital signature.
         * &gt; **NOTE:** From version 1.240.0, `sync_scope` can be set.
         * 
         * @return builder
         * 
         */
        public Builder syncScope(@Nullable Output<String> syncScope) {
            $.syncScope = syncScope;
            return this;
        }

        /**
         * @param syncScope The synchronization scope. Valid values:
         * - `REPO`: Encrypts or decrypts data.
         * - `NAMESPACE`: Generates or verifies a digital signature.
         * &gt; **NOTE:** From version 1.240.0, `sync_scope` can be set.
         * 
         * @return builder
         * 
         */
        public Builder syncScope(String syncScope) {
            return syncScope(Output.of(syncScope));
        }

        /**
         * @param syncTrigger The policy configured to trigger the synchronization rule. Default value: `PASSIVE`. Valid values:
         * - `INITIATIVE`: Manually triggers the synchronization rule.
         * - `PASSIVE`: Automatically triggers the synchronization rule.
         * 
         * @return builder
         * 
         */
        public Builder syncTrigger(@Nullable Output<String> syncTrigger) {
            $.syncTrigger = syncTrigger;
            return this;
        }

        /**
         * @param syncTrigger The policy configured to trigger the synchronization rule. Default value: `PASSIVE`. Valid values:
         * - `INITIATIVE`: Manually triggers the synchronization rule.
         * - `PASSIVE`: Automatically triggers the synchronization rule.
         * 
         * @return builder
         * 
         */
        public Builder syncTrigger(String syncTrigger) {
            return syncTrigger(Output.of(syncTrigger));
        }

        /**
         * @param tagFilter The regular expression used to filter image tags.
         * 
         * @return builder
         * 
         */
        public Builder tagFilter(Output<String> tagFilter) {
            $.tagFilter = tagFilter;
            return this;
        }

        /**
         * @param tagFilter The regular expression used to filter image tags.
         * 
         * @return builder
         * 
         */
        public Builder tagFilter(String tagFilter) {
            return tagFilter(Output.of(tagFilter));
        }

        /**
         * @param targetInstanceId The ID of the destination instance.
         * 
         * @return builder
         * 
         */
        public Builder targetInstanceId(Output<String> targetInstanceId) {
            $.targetInstanceId = targetInstanceId;
            return this;
        }

        /**
         * @param targetInstanceId The ID of the destination instance.
         * 
         * @return builder
         * 
         */
        public Builder targetInstanceId(String targetInstanceId) {
            return targetInstanceId(Output.of(targetInstanceId));
        }

        /**
         * @param targetNamespaceName The namespace name of the destination instance.
         * 
         * @return builder
         * 
         */
        public Builder targetNamespaceName(Output<String> targetNamespaceName) {
            $.targetNamespaceName = targetNamespaceName;
            return this;
        }

        /**
         * @param targetNamespaceName The namespace name of the destination instance.
         * 
         * @return builder
         * 
         */
        public Builder targetNamespaceName(String targetNamespaceName) {
            return targetNamespaceName(Output.of(targetNamespaceName));
        }

        /**
         * @param targetRegionId The region ID of the destination instance.
         * 
         * @return builder
         * 
         */
        public Builder targetRegionId(Output<String> targetRegionId) {
            $.targetRegionId = targetRegionId;
            return this;
        }

        /**
         * @param targetRegionId The region ID of the destination instance.
         * 
         * @return builder
         * 
         */
        public Builder targetRegionId(String targetRegionId) {
            return targetRegionId(Output.of(targetRegionId));
        }

        /**
         * @param targetRepoName The image repository name of the destination instance.
         * 
         * @return builder
         * 
         */
        public Builder targetRepoName(@Nullable Output<String> targetRepoName) {
            $.targetRepoName = targetRepoName;
            return this;
        }

        /**
         * @param targetRepoName The image repository name of the destination instance.
         * 
         * @return builder
         * 
         */
        public Builder targetRepoName(String targetRepoName) {
            return targetRepoName(Output.of(targetRepoName));
        }

        /**
         * @param targetUserId The UID of the account to which the target instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder targetUserId(@Nullable Output<String> targetUserId) {
            $.targetUserId = targetUserId;
            return this;
        }

        /**
         * @param targetUserId The UID of the account to which the target instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder targetUserId(String targetUserId) {
            return targetUserId(Output.of(targetUserId));
        }

        public RegistryEnterpriseSyncRuleArgs build() {
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("RegistryEnterpriseSyncRuleArgs", "instanceId");
            }
            if ($.namespaceName == null) {
                throw new MissingRequiredPropertyException("RegistryEnterpriseSyncRuleArgs", "namespaceName");
            }
            if ($.tagFilter == null) {
                throw new MissingRequiredPropertyException("RegistryEnterpriseSyncRuleArgs", "tagFilter");
            }
            if ($.targetInstanceId == null) {
                throw new MissingRequiredPropertyException("RegistryEnterpriseSyncRuleArgs", "targetInstanceId");
            }
            if ($.targetNamespaceName == null) {
                throw new MissingRequiredPropertyException("RegistryEnterpriseSyncRuleArgs", "targetNamespaceName");
            }
            if ($.targetRegionId == null) {
                throw new MissingRequiredPropertyException("RegistryEnterpriseSyncRuleArgs", "targetRegionId");
            }
            return $;
        }
    }

}
