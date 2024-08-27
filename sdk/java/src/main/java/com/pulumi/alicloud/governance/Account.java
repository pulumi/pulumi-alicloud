// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.governance;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.governance.AccountArgs;
import com.pulumi.alicloud.governance.inputs.AccountState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Governance Account can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:governance/account:Account example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:governance/account:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the enrolled account.
     * - If you are creating a new resource account, this parameter is not required.
     * - If you are enrolling a existing account to account factory, this parameter is required.
     * 
     */
    @Export(name="accountId", refs={Integer.class}, tree="[0]")
    private Output<Integer> accountId;

    /**
     * @return The ID of the enrolled account.
     * - If you are creating a new resource account, this parameter is not required.
     * - If you are enrolling a existing account to account factory, this parameter is required.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Account name prefix.
     * - This parameter is required if you are creating a new resource account.
     * - If the registration application is applied to an existing account, this parameter does not need to be filled in.
     * 
     */
    @Export(name="accountNamePrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountNamePrefix;

    /**
     * @return Account name prefix.
     * - This parameter is required if you are creating a new resource account.
     * - If the registration application is applied to an existing account, this parameter does not need to be filled in.
     * 
     */
    public Output<Optional<String>> accountNamePrefix() {
        return Codegen.optional(this.accountNamePrefix);
    }
    /**
     * The baseline ID.
     * 
     * If it is left blank, the system default baseline is used by default.
     * 
     */
    @Export(name="baselineId", refs={String.class}, tree="[0]")
    private Output<String> baselineId;

    /**
     * @return The baseline ID.
     * 
     * If it is left blank, the system default baseline is used by default.
     * 
     */
    public Output<String> baselineId() {
        return this.baselineId;
    }
    /**
     * The account display name.
     * - This parameter is required if you are creating a new resource account.
     * - If the registration application is applied to an existing account, this parameter does not need to be filled in.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The account display name.
     * - This parameter is required if you are creating a new resource account.
     * - If the registration application is applied to an existing account, this parameter does not need to be filled in.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The ID of the parent resource folder.
     * 
     * If you want to create a new resource account and leave this parameter blank, the account is created in the Root folder by default.
     * 
     * If the registration application is applied to an existing account, this parameter does not need to be filled in.
     * 
     */
    @Export(name="folderId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> folderId;

    /**
     * @return The ID of the parent resource folder.
     * 
     * If you want to create a new resource account and leave this parameter blank, the account is created in the Root folder by default.
     * 
     * If the registration application is applied to an existing account, this parameter does not need to be filled in.
     * 
     */
    public Output<Optional<String>> folderId() {
        return Codegen.optional(this.folderId);
    }
    /**
     * The ID of the billing account. If you leave this parameter empty, the current account is used as the billing account.
     * 
     */
    @Export(name="payerAccountId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> payerAccountId;

    /**
     * @return The ID of the billing account. If you leave this parameter empty, the current account is used as the billing account.
     * 
     */
    public Output<Optional<Integer>> payerAccountId() {
        return Codegen.optional(this.payerAccountId);
    }
    /**
     * Account registration status. Value:
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Account registration status. Value:
     * 
     */
    public Output<String> status() {
        return this.status;
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
        super("alicloud:governance/account:Account", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Account(java.lang.String name, Output<java.lang.String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:governance/account:Account", name, state, makeResourceOptions(options, id), false);
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