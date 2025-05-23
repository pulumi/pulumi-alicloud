// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.resourcemanager.AccountArgs;
import com.pulumi.alicloud.resourcemanager.inputs.AccountState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Resource Manager Account resource.
 * 
 * For information about Resource Manager Account and how to use it, see [What is Account](https://www.alibabacloud.com/help/en/doc-detail/111231.htm).
 * 
 * &gt; **NOTE:** Available since v1.83.0.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.random.integer;
 * import com.pulumi.random.integerArgs;
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetFoldersArgs;
 * import com.pulumi.alicloud.resourcemanager.Account;
 * import com.pulumi.alicloud.resourcemanager.AccountArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var name = config.get("name").orElse("tf-example");
 *         final var displayName = config.get("displayName").orElse("EAccount");
 *         var default_ = new Integer("default", IntegerArgs.builder()
 *             .min(10000)
 *             .max(99999)
 *             .build());
 * 
 *         final var example = ResourcemanagerFunctions.getFolders(GetFoldersArgs.builder()
 *             .build());
 * 
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .displayName(String.format("%s-%s", displayName,default_.result()))
 *             .folderId(example.ids()[0])
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Resource Manager Account can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:resourcemanager/account:Account example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:resourcemanager/account:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * . Field &#39;abandon_able_check_id&#39; has been deprecated from provider version 1.249.0. New field &#39;abandonable_check_id&#39; instead.
     * 
     * @deprecated
     * Field &#39;abandon_able_check_id&#39; has been deprecated since provider version 1.248.0. New field &#39;abandonable_check_id&#39; instead.
     * 
     */
    @Deprecated /* Field 'abandon_able_check_id' has been deprecated since provider version 1.248.0. New field 'abandonable_check_id' instead. */
    @Export(name="abandonAbleCheckIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> abandonAbleCheckIds;

    /**
     * @return . Field &#39;abandon_able_check_id&#39; has been deprecated from provider version 1.249.0. New field &#39;abandonable_check_id&#39; instead.
     * 
     */
    public Output<Optional<List<String>>> abandonAbleCheckIds() {
        return Codegen.optional(this.abandonAbleCheckIds);
    }
    /**
     * The ID of the check item that can choose to abandon and continue to perform member deletion.
     * The ID is obtained from the return parameter AbandonableChecks of GetAccountDeletionCheckResult.
     * 
     */
    @Export(name="abandonableCheckIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> abandonableCheckIds;

    /**
     * @return The ID of the check item that can choose to abandon and continue to perform member deletion.
     * The ID is obtained from the return parameter AbandonableChecks of GetAccountDeletionCheckResult.
     * 
     */
    public Output<Optional<List<String>>> abandonableCheckIds() {
        return Codegen.optional(this.abandonableCheckIds);
    }
    /**
     * Account name prefix. Empty the system randomly generated.
     * Format: English letters, numbers, and special characters_.-can be entered. It must start and end with an English letter or number, and continuous special characters_.-cannot be entered &#39;_.-&#39;.
     * The format of the full account name is {@literal @}&lt; ResourceDirectoryId&gt;.aliyunid.com, for example: &#39;alice {@literal @} rd-3G ****.aliyunid.com&#39;
     * The account name must be unique in the resource directory.
     * 
     */
    @Export(name="accountNamePrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountNamePrefix;

    /**
     * @return Account name prefix. Empty the system randomly generated.
     * Format: English letters, numbers, and special characters_.-can be entered. It must start and end with an English letter or number, and continuous special characters_.-cannot be entered &#39;_.-&#39;.
     * The format of the full account name is {@literal @}&lt; ResourceDirectoryId&gt;.aliyunid.com, for example: &#39;alice {@literal @} rd-3G ****.aliyunid.com&#39;
     * The account name must be unique in the resource directory.
     * 
     */
    public Output<Optional<String>> accountNamePrefix() {
        return Codegen.optional(this.accountNamePrefix);
    }
    /**
     * Member name
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return Member name
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The ID of the parent folder
     * 
     */
    @Export(name="folderId", refs={String.class}, tree="[0]")
    private Output<String> folderId;

    /**
     * @return The ID of the parent folder
     * 
     */
    public Output<String> folderId() {
        return this.folderId;
    }
    /**
     * Whether to force delete the account.
     * 
     */
    @Export(name="forceDelete", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDelete;

    /**
     * @return Whether to force delete the account.
     * 
     */
    public Output<Optional<Boolean>> forceDelete() {
        return Codegen.optional(this.forceDelete);
    }
    /**
     * Ways for members to join the resource directory.  invited, created
     * 
     */
    @Export(name="joinMethod", refs={String.class}, tree="[0]")
    private Output<String> joinMethod;

    /**
     * @return Ways for members to join the resource directory.  invited, created
     * 
     */
    public Output<String> joinMethod() {
        return this.joinMethod;
    }
    /**
     * The time when the member joined the resource directory
     * 
     */
    @Export(name="joinTime", refs={String.class}, tree="[0]")
    private Output<String> joinTime;

    /**
     * @return The time when the member joined the resource directory
     * 
     */
    public Output<String> joinTime() {
        return this.joinTime;
    }
    /**
     * The modification time of the invitation
     * 
     */
    @Export(name="modifyTime", refs={String.class}, tree="[0]")
    private Output<String> modifyTime;

    /**
     * @return The modification time of the invitation
     * 
     */
    public Output<String> modifyTime() {
        return this.modifyTime;
    }
    /**
     * The settlement account ID. If it is left blank, the newly created member will be used for self-settlement.
     * 
     */
    @Export(name="payerAccountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> payerAccountId;

    /**
     * @return The settlement account ID. If it is left blank, the newly created member will be used for self-settlement.
     * 
     */
    public Output<Optional<String>> payerAccountId() {
        return Codegen.optional(this.payerAccountId);
    }
    /**
     * The identity type of the member. Valid values:
     * - resell: The member is an account for a reseller. This is the default value. A relationship is automatically established between the member and the reseller. The management account of the resource directory must be used as the billing account of the member.
     * - non_resell: The member is not an account for a reseller. The member is an account that is not associated with a reseller. You can directly use the account to purchase Alibaba Cloud resources. The member is used as its own billing account.
     * 
     * &gt; **NOTE:**  This parameter is available only for resellers at the international site (alibabacloud.com).
     * 
     */
    @Export(name="resellAccountType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resellAccountType;

    /**
     * @return The identity type of the member. Valid values:
     * - resell: The member is an account for a reseller. This is the default value. A relationship is automatically established between the member and the reseller. The management account of the resource directory must be used as the billing account of the member.
     * - non_resell: The member is not an account for a reseller. The member is an account that is not associated with a reseller. You can directly use the account to purchase Alibaba Cloud resources. The member is used as its own billing account.
     * 
     * &gt; **NOTE:**  This parameter is available only for resellers at the international site (alibabacloud.com).
     * 
     */
    public Output<Optional<String>> resellAccountType() {
        return Codegen.optional(this.resellAccountType);
    }
    /**
     * Resource directory ID
     * 
     */
    @Export(name="resourceDirectoryId", refs={String.class}, tree="[0]")
    private Output<String> resourceDirectoryId;

    /**
     * @return Resource directory ID
     * 
     */
    public Output<String> resourceDirectoryId() {
        return this.resourceDirectoryId;
    }
    /**
     * Member joining status.  CreateSuccess,CreateVerifying,CreateFailed,CreateExpired,CreateCancelled,PromoteVerifying,PromoteFailed,PromoteExpired,PromoteCancelled,PromoteSuccess,InviteSuccess,Removed
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Member joining status.  CreateSuccess,CreateVerifying,CreateFailed,CreateExpired,CreateCancelled,PromoteVerifying,PromoteFailed,PromoteExpired,PromoteCancelled,PromoteSuccess,InviteSuccess,Removed
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tag of the resource
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tag of the resource
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Member type. The value of ResourceAccount indicates the resource account
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Member type. The value of ResourceAccount indicates the resource account
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Account(java.lang.String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(java.lang.String name, AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(java.lang.String name, AccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/account:Account", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Account(java.lang.String name, Output<java.lang.String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/account:Account", name, state, makeResourceOptions(options, id), false);
    }

    private static AccountArgs makeArgs(AccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AccountArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Account get(java.lang.String name, Output<java.lang.String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, state, options);
    }
}
