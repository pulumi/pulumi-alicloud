// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountState extends com.pulumi.resources.ResourceArgs {

    public static final AccountState Empty = new AccountState();

    /**
     * . Field &#39;abandon_able_check_id&#39; has been deprecated from provider version 1.249.0. New field &#39;abandonable_check_id&#39; instead.
     * 
     * @deprecated
     * Field &#39;abandon_able_check_id&#39; has been deprecated since provider version 1.248.0. New field &#39;abandonable_check_id&#39; instead.
     * 
     */
    @Deprecated /* Field 'abandon_able_check_id' has been deprecated since provider version 1.248.0. New field 'abandonable_check_id' instead. */
    @Import(name="abandonAbleCheckIds")
    private @Nullable Output<List<String>> abandonAbleCheckIds;

    /**
     * @return . Field &#39;abandon_able_check_id&#39; has been deprecated from provider version 1.249.0. New field &#39;abandonable_check_id&#39; instead.
     * 
     * @deprecated
     * Field &#39;abandon_able_check_id&#39; has been deprecated since provider version 1.248.0. New field &#39;abandonable_check_id&#39; instead.
     * 
     */
    @Deprecated /* Field 'abandon_able_check_id' has been deprecated since provider version 1.248.0. New field 'abandonable_check_id' instead. */
    public Optional<Output<List<String>>> abandonAbleCheckIds() {
        return Optional.ofNullable(this.abandonAbleCheckIds);
    }

    /**
     * The ID of the check item that can choose to abandon and continue to perform member deletion.
     * The ID is obtained from the return parameter AbandonableChecks of GetAccountDeletionCheckResult.
     * 
     */
    @Import(name="abandonableCheckIds")
    private @Nullable Output<List<String>> abandonableCheckIds;

    /**
     * @return The ID of the check item that can choose to abandon and continue to perform member deletion.
     * The ID is obtained from the return parameter AbandonableChecks of GetAccountDeletionCheckResult.
     * 
     */
    public Optional<Output<List<String>>> abandonableCheckIds() {
        return Optional.ofNullable(this.abandonableCheckIds);
    }

    /**
     * Account name prefix. Empty the system randomly generated.
     * Format: English letters, numbers, and special characters_.-can be entered. It must start and end with an English letter or number, and continuous special characters_.-cannot be entered &#39;_.-&#39;.
     * The format of the full account name is {@literal @}&lt; ResourceDirectoryId&gt;.aliyunid.com, for example: &#39;alice {@literal @} rd-3G ****.aliyunid.com&#39;
     * The account name must be unique in the resource directory.
     * 
     */
    @Import(name="accountNamePrefix")
    private @Nullable Output<String> accountNamePrefix;

    /**
     * @return Account name prefix. Empty the system randomly generated.
     * Format: English letters, numbers, and special characters_.-can be entered. It must start and end with an English letter or number, and continuous special characters_.-cannot be entered &#39;_.-&#39;.
     * The format of the full account name is {@literal @}&lt; ResourceDirectoryId&gt;.aliyunid.com, for example: &#39;alice {@literal @} rd-3G ****.aliyunid.com&#39;
     * The account name must be unique in the resource directory.
     * 
     */
    public Optional<Output<String>> accountNamePrefix() {
        return Optional.ofNullable(this.accountNamePrefix);
    }

    /**
     * Member name
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Member name
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ID of the parent folder
     * 
     */
    @Import(name="folderId")
    private @Nullable Output<String> folderId;

    /**
     * @return The ID of the parent folder
     * 
     */
    public Optional<Output<String>> folderId() {
        return Optional.ofNullable(this.folderId);
    }

    /**
     * Whether to force delete the account.
     * 
     */
    @Import(name="forceDelete")
    private @Nullable Output<Boolean> forceDelete;

    /**
     * @return Whether to force delete the account.
     * 
     */
    public Optional<Output<Boolean>> forceDelete() {
        return Optional.ofNullable(this.forceDelete);
    }

    /**
     * Ways for members to join the resource directory.  invited, created
     * 
     */
    @Import(name="joinMethod")
    private @Nullable Output<String> joinMethod;

    /**
     * @return Ways for members to join the resource directory.  invited, created
     * 
     */
    public Optional<Output<String>> joinMethod() {
        return Optional.ofNullable(this.joinMethod);
    }

    /**
     * The time when the member joined the resource directory
     * 
     */
    @Import(name="joinTime")
    private @Nullable Output<String> joinTime;

    /**
     * @return The time when the member joined the resource directory
     * 
     */
    public Optional<Output<String>> joinTime() {
        return Optional.ofNullable(this.joinTime);
    }

    /**
     * The modification time of the invitation
     * 
     */
    @Import(name="modifyTime")
    private @Nullable Output<String> modifyTime;

    /**
     * @return The modification time of the invitation
     * 
     */
    public Optional<Output<String>> modifyTime() {
        return Optional.ofNullable(this.modifyTime);
    }

    /**
     * The settlement account ID. If it is left blank, the newly created member will be used for self-settlement.
     * 
     */
    @Import(name="payerAccountId")
    private @Nullable Output<String> payerAccountId;

    /**
     * @return The settlement account ID. If it is left blank, the newly created member will be used for self-settlement.
     * 
     */
    public Optional<Output<String>> payerAccountId() {
        return Optional.ofNullable(this.payerAccountId);
    }

    /**
     * The identity type of the member. Valid values:
     * - resell: The member is an account for a reseller. This is the default value. A relationship is automatically established between the member and the reseller. The management account of the resource directory must be used as the billing account of the member.
     * - non_resell: The member is not an account for a reseller. The member is an account that is not associated with a reseller. You can directly use the account to purchase Alibaba Cloud resources. The member is used as its own billing account.
     * 
     * &gt; **NOTE:**  This parameter is available only for resellers at the international site (alibabacloud.com).
     * 
     */
    @Import(name="resellAccountType")
    private @Nullable Output<String> resellAccountType;

    /**
     * @return The identity type of the member. Valid values:
     * - resell: The member is an account for a reseller. This is the default value. A relationship is automatically established between the member and the reseller. The management account of the resource directory must be used as the billing account of the member.
     * - non_resell: The member is not an account for a reseller. The member is an account that is not associated with a reseller. You can directly use the account to purchase Alibaba Cloud resources. The member is used as its own billing account.
     * 
     * &gt; **NOTE:**  This parameter is available only for resellers at the international site (alibabacloud.com).
     * 
     */
    public Optional<Output<String>> resellAccountType() {
        return Optional.ofNullable(this.resellAccountType);
    }

    /**
     * Resource directory ID
     * 
     */
    @Import(name="resourceDirectoryId")
    private @Nullable Output<String> resourceDirectoryId;

    /**
     * @return Resource directory ID
     * 
     */
    public Optional<Output<String>> resourceDirectoryId() {
        return Optional.ofNullable(this.resourceDirectoryId);
    }

    /**
     * Member joining status.  CreateSuccess,CreateVerifying,CreateFailed,CreateExpired,CreateCancelled,PromoteVerifying,PromoteFailed,PromoteExpired,PromoteCancelled,PromoteSuccess,InviteSuccess,Removed
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Member joining status.  CreateSuccess,CreateVerifying,CreateFailed,CreateExpired,CreateCancelled,PromoteVerifying,PromoteFailed,PromoteExpired,PromoteCancelled,PromoteSuccess,InviteSuccess,Removed
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tag of the resource
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tag of the resource
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Member type. The value of ResourceAccount indicates the resource account
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Member type. The value of ResourceAccount indicates the resource account
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AccountState() {}

    private AccountState(AccountState $) {
        this.abandonAbleCheckIds = $.abandonAbleCheckIds;
        this.abandonableCheckIds = $.abandonableCheckIds;
        this.accountNamePrefix = $.accountNamePrefix;
        this.displayName = $.displayName;
        this.folderId = $.folderId;
        this.forceDelete = $.forceDelete;
        this.joinMethod = $.joinMethod;
        this.joinTime = $.joinTime;
        this.modifyTime = $.modifyTime;
        this.payerAccountId = $.payerAccountId;
        this.resellAccountType = $.resellAccountType;
        this.resourceDirectoryId = $.resourceDirectoryId;
        this.status = $.status;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountState $;

        public Builder() {
            $ = new AccountState();
        }

        public Builder(AccountState defaults) {
            $ = new AccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param abandonAbleCheckIds . Field &#39;abandon_able_check_id&#39; has been deprecated from provider version 1.249.0. New field &#39;abandonable_check_id&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;abandon_able_check_id&#39; has been deprecated since provider version 1.248.0. New field &#39;abandonable_check_id&#39; instead.
         * 
         */
        @Deprecated /* Field 'abandon_able_check_id' has been deprecated since provider version 1.248.0. New field 'abandonable_check_id' instead. */
        public Builder abandonAbleCheckIds(@Nullable Output<List<String>> abandonAbleCheckIds) {
            $.abandonAbleCheckIds = abandonAbleCheckIds;
            return this;
        }

        /**
         * @param abandonAbleCheckIds . Field &#39;abandon_able_check_id&#39; has been deprecated from provider version 1.249.0. New field &#39;abandonable_check_id&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;abandon_able_check_id&#39; has been deprecated since provider version 1.248.0. New field &#39;abandonable_check_id&#39; instead.
         * 
         */
        @Deprecated /* Field 'abandon_able_check_id' has been deprecated since provider version 1.248.0. New field 'abandonable_check_id' instead. */
        public Builder abandonAbleCheckIds(List<String> abandonAbleCheckIds) {
            return abandonAbleCheckIds(Output.of(abandonAbleCheckIds));
        }

        /**
         * @param abandonAbleCheckIds . Field &#39;abandon_able_check_id&#39; has been deprecated from provider version 1.249.0. New field &#39;abandonable_check_id&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;abandon_able_check_id&#39; has been deprecated since provider version 1.248.0. New field &#39;abandonable_check_id&#39; instead.
         * 
         */
        @Deprecated /* Field 'abandon_able_check_id' has been deprecated since provider version 1.248.0. New field 'abandonable_check_id' instead. */
        public Builder abandonAbleCheckIds(String... abandonAbleCheckIds) {
            return abandonAbleCheckIds(List.of(abandonAbleCheckIds));
        }

        /**
         * @param abandonableCheckIds The ID of the check item that can choose to abandon and continue to perform member deletion.
         * The ID is obtained from the return parameter AbandonableChecks of GetAccountDeletionCheckResult.
         * 
         * @return builder
         * 
         */
        public Builder abandonableCheckIds(@Nullable Output<List<String>> abandonableCheckIds) {
            $.abandonableCheckIds = abandonableCheckIds;
            return this;
        }

        /**
         * @param abandonableCheckIds The ID of the check item that can choose to abandon and continue to perform member deletion.
         * The ID is obtained from the return parameter AbandonableChecks of GetAccountDeletionCheckResult.
         * 
         * @return builder
         * 
         */
        public Builder abandonableCheckIds(List<String> abandonableCheckIds) {
            return abandonableCheckIds(Output.of(abandonableCheckIds));
        }

        /**
         * @param abandonableCheckIds The ID of the check item that can choose to abandon and continue to perform member deletion.
         * The ID is obtained from the return parameter AbandonableChecks of GetAccountDeletionCheckResult.
         * 
         * @return builder
         * 
         */
        public Builder abandonableCheckIds(String... abandonableCheckIds) {
            return abandonableCheckIds(List.of(abandonableCheckIds));
        }

        /**
         * @param accountNamePrefix Account name prefix. Empty the system randomly generated.
         * Format: English letters, numbers, and special characters_.-can be entered. It must start and end with an English letter or number, and continuous special characters_.-cannot be entered &#39;_.-&#39;.
         * The format of the full account name is {@literal @}&lt; ResourceDirectoryId&gt;.aliyunid.com, for example: &#39;alice {@literal @} rd-3G ****.aliyunid.com&#39;
         * The account name must be unique in the resource directory.
         * 
         * @return builder
         * 
         */
        public Builder accountNamePrefix(@Nullable Output<String> accountNamePrefix) {
            $.accountNamePrefix = accountNamePrefix;
            return this;
        }

        /**
         * @param accountNamePrefix Account name prefix. Empty the system randomly generated.
         * Format: English letters, numbers, and special characters_.-can be entered. It must start and end with an English letter or number, and continuous special characters_.-cannot be entered &#39;_.-&#39;.
         * The format of the full account name is {@literal @}&lt; ResourceDirectoryId&gt;.aliyunid.com, for example: &#39;alice {@literal @} rd-3G ****.aliyunid.com&#39;
         * The account name must be unique in the resource directory.
         * 
         * @return builder
         * 
         */
        public Builder accountNamePrefix(String accountNamePrefix) {
            return accountNamePrefix(Output.of(accountNamePrefix));
        }

        /**
         * @param displayName Member name
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Member name
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param folderId The ID of the parent folder
         * 
         * @return builder
         * 
         */
        public Builder folderId(@Nullable Output<String> folderId) {
            $.folderId = folderId;
            return this;
        }

        /**
         * @param folderId The ID of the parent folder
         * 
         * @return builder
         * 
         */
        public Builder folderId(String folderId) {
            return folderId(Output.of(folderId));
        }

        /**
         * @param forceDelete Whether to force delete the account.
         * 
         * @return builder
         * 
         */
        public Builder forceDelete(@Nullable Output<Boolean> forceDelete) {
            $.forceDelete = forceDelete;
            return this;
        }

        /**
         * @param forceDelete Whether to force delete the account.
         * 
         * @return builder
         * 
         */
        public Builder forceDelete(Boolean forceDelete) {
            return forceDelete(Output.of(forceDelete));
        }

        /**
         * @param joinMethod Ways for members to join the resource directory.  invited, created
         * 
         * @return builder
         * 
         */
        public Builder joinMethod(@Nullable Output<String> joinMethod) {
            $.joinMethod = joinMethod;
            return this;
        }

        /**
         * @param joinMethod Ways for members to join the resource directory.  invited, created
         * 
         * @return builder
         * 
         */
        public Builder joinMethod(String joinMethod) {
            return joinMethod(Output.of(joinMethod));
        }

        /**
         * @param joinTime The time when the member joined the resource directory
         * 
         * @return builder
         * 
         */
        public Builder joinTime(@Nullable Output<String> joinTime) {
            $.joinTime = joinTime;
            return this;
        }

        /**
         * @param joinTime The time when the member joined the resource directory
         * 
         * @return builder
         * 
         */
        public Builder joinTime(String joinTime) {
            return joinTime(Output.of(joinTime));
        }

        /**
         * @param modifyTime The modification time of the invitation
         * 
         * @return builder
         * 
         */
        public Builder modifyTime(@Nullable Output<String> modifyTime) {
            $.modifyTime = modifyTime;
            return this;
        }

        /**
         * @param modifyTime The modification time of the invitation
         * 
         * @return builder
         * 
         */
        public Builder modifyTime(String modifyTime) {
            return modifyTime(Output.of(modifyTime));
        }

        /**
         * @param payerAccountId The settlement account ID. If it is left blank, the newly created member will be used for self-settlement.
         * 
         * @return builder
         * 
         */
        public Builder payerAccountId(@Nullable Output<String> payerAccountId) {
            $.payerAccountId = payerAccountId;
            return this;
        }

        /**
         * @param payerAccountId The settlement account ID. If it is left blank, the newly created member will be used for self-settlement.
         * 
         * @return builder
         * 
         */
        public Builder payerAccountId(String payerAccountId) {
            return payerAccountId(Output.of(payerAccountId));
        }

        /**
         * @param resellAccountType The identity type of the member. Valid values:
         * - resell: The member is an account for a reseller. This is the default value. A relationship is automatically established between the member and the reseller. The management account of the resource directory must be used as the billing account of the member.
         * - non_resell: The member is not an account for a reseller. The member is an account that is not associated with a reseller. You can directly use the account to purchase Alibaba Cloud resources. The member is used as its own billing account.
         * 
         * &gt; **NOTE:**  This parameter is available only for resellers at the international site (alibabacloud.com).
         * 
         * @return builder
         * 
         */
        public Builder resellAccountType(@Nullable Output<String> resellAccountType) {
            $.resellAccountType = resellAccountType;
            return this;
        }

        /**
         * @param resellAccountType The identity type of the member. Valid values:
         * - resell: The member is an account for a reseller. This is the default value. A relationship is automatically established between the member and the reseller. The management account of the resource directory must be used as the billing account of the member.
         * - non_resell: The member is not an account for a reseller. The member is an account that is not associated with a reseller. You can directly use the account to purchase Alibaba Cloud resources. The member is used as its own billing account.
         * 
         * &gt; **NOTE:**  This parameter is available only for resellers at the international site (alibabacloud.com).
         * 
         * @return builder
         * 
         */
        public Builder resellAccountType(String resellAccountType) {
            return resellAccountType(Output.of(resellAccountType));
        }

        /**
         * @param resourceDirectoryId Resource directory ID
         * 
         * @return builder
         * 
         */
        public Builder resourceDirectoryId(@Nullable Output<String> resourceDirectoryId) {
            $.resourceDirectoryId = resourceDirectoryId;
            return this;
        }

        /**
         * @param resourceDirectoryId Resource directory ID
         * 
         * @return builder
         * 
         */
        public Builder resourceDirectoryId(String resourceDirectoryId) {
            return resourceDirectoryId(Output.of(resourceDirectoryId));
        }

        /**
         * @param status Member joining status.  CreateSuccess,CreateVerifying,CreateFailed,CreateExpired,CreateCancelled,PromoteVerifying,PromoteFailed,PromoteExpired,PromoteCancelled,PromoteSuccess,InviteSuccess,Removed
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Member joining status.  CreateSuccess,CreateVerifying,CreateFailed,CreateExpired,CreateCancelled,PromoteVerifying,PromoteFailed,PromoteExpired,PromoteCancelled,PromoteSuccess,InviteSuccess,Removed
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags The tag of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tag of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param type Member type. The value of ResourceAccount indicates the resource account
         * 
         * The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Member type. The value of ResourceAccount indicates the resource account
         * 
         * The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AccountState build() {
            return $;
        }
    }

}
