// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dcdn.WafRuleArgs;
import com.pulumi.alicloud.dcdn.inputs.WafRuleState;
import com.pulumi.alicloud.dcdn.outputs.WafRuleCondition;
import com.pulumi.alicloud.dcdn.outputs.WafRuleRateLimit;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Dcdn Waf Rule resource.
 * 
 * For information about Dcdn Waf Rule and how to use it, see [What is Waf Rule](https://www.alibabacloud.com/help/en/dcdn/developer-reference/api-dcdn-2018-01-15-batchcreatedcdnwafrules).
 * 
 * &gt; **NOTE:** Available since v1.201.0.
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
 * import com.pulumi.alicloud.dcdn.WafPolicy;
 * import com.pulumi.alicloud.dcdn.WafPolicyArgs;
 * import com.pulumi.alicloud.dcdn.WafRule;
 * import com.pulumi.alicloud.dcdn.WafRuleArgs;
 * import com.pulumi.alicloud.dcdn.inputs.WafRuleConditionArgs;
 * import com.pulumi.alicloud.dcdn.inputs.WafRuleRateLimitArgs;
 * import com.pulumi.alicloud.dcdn.inputs.WafRuleRateLimitStatusArgs;
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
 *         final var name = config.get("name").orElse("tf_example");
 *         var default_ = new Integer("default", IntegerArgs.builder()
 *             .min(10000)
 *             .max(99999)
 *             .build());
 * 
 *         var example = new WafPolicy("example", WafPolicyArgs.builder()
 *             .defenseScene("waf_group")
 *             .policyName(String.format("%s_%s", name,default_.result()))
 *             .policyType("custom")
 *             .status("on")
 *             .build());
 * 
 *         var exampleWafRule = new WafRule("exampleWafRule", WafRuleArgs.builder()
 *             .policyId(example.id())
 *             .ruleName(name)
 *             .conditions(            
 *                 WafRuleConditionArgs.builder()
 *                     .key("URI")
 *                     .opValue("ne")
 *                     .values("/login.php")
 *                     .build(),
 *                 WafRuleConditionArgs.builder()
 *                     .key("Header")
 *                     .subKey("a")
 *                     .opValue("eq")
 *                     .values("b")
 *                     .build())
 *             .status("on")
 *             .action("monitor")
 *             .rateLimit(WafRuleRateLimitArgs.builder()
 *                 .target("IP")
 *                 .interval(5)
 *                 .threshold(5)
 *                 .ttl(1800)
 *                 .status(WafRuleRateLimitStatusArgs.builder()
 *                     .code("200")
 *                     .ratio(60)
 *                     .build())
 *                 .build())
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
 * Dcdn Waf Rule can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:dcdn/wafRule:WafRule example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:dcdn/wafRule:WafRule")
public class WafRule extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the action of the rule. Valid values: `block`, `monitor`, `js`, `deny`.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> action;

    /**
     * @return Specifies the action of the rule. Valid values: `block`, `monitor`, `js`, `deny`.
     * 
     */
    public Output<Optional<String>> action() {
        return Codegen.optional(this.action);
    }
    /**
     * Specifies whether to enable rate limiting. Valid values: `on` and `off`. **NOTE:** This parameter is required when policy is of type `custom_acl`.
     * 
     */
    @Export(name="ccStatus", refs={String.class}, tree="[0]")
    private Output<String> ccStatus;

    /**
     * @return Specifies whether to enable rate limiting. Valid values: `on` and `off`. **NOTE:** This parameter is required when policy is of type `custom_acl`.
     * 
     */
    public Output<String> ccStatus() {
        return this.ccStatus;
    }
    /**
     * The blocked regions in the Chinese mainland, separated by commas (,).
     * 
     */
    @Export(name="cnRegionList", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cnRegionList;

    /**
     * @return The blocked regions in the Chinese mainland, separated by commas (,).
     * 
     */
    public Output<Optional<String>> cnRegionList() {
        return Codegen.optional(this.cnRegionList);
    }
    /**
     * Conditions that trigger the rule. See `conditions` below. **NOTE:** This parameter is required when policy is of type `custom_acl` or `whitelist`.
     * 
     */
    @Export(name="conditions", refs={List.class,WafRuleCondition.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WafRuleCondition>> conditions;

    /**
     * @return Conditions that trigger the rule. See `conditions` below. **NOTE:** This parameter is required when policy is of type `custom_acl` or `whitelist`.
     * 
     */
    public Output<Optional<List<WafRuleCondition>>> conditions() {
        return Codegen.optional(this.conditions);
    }
    /**
     * The type of protection policy. The following scenarios are supported:-waf_group:Web basic protection-custom_acl: Custom protection policy-whitelist: whitelist
     * 
     */
    @Export(name="defenseScene", refs={String.class}, tree="[0]")
    private Output<String> defenseScene;

    /**
     * @return The type of protection policy. The following scenarios are supported:-waf_group:Web basic protection-custom_acl: Custom protection policy-whitelist: whitelist
     * 
     */
    public Output<String> defenseScene() {
        return this.defenseScene;
    }
    /**
     * The effective scope of the rate limiting blacklist. If you set ccStatus to on, you must configure this parameter. Valid values: `rule` (takes effect for the current rule) and `service` (takes effect globally).
     * 
     */
    @Export(name="effect", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> effect;

    /**
     * @return The effective scope of the rate limiting blacklist. If you set ccStatus to on, you must configure this parameter. Valid values: `rule` (takes effect for the current rule) and `service` (takes effect globally).
     * 
     */
    public Output<Optional<String>> effect() {
        return Codegen.optional(this.effect);
    }
    /**
     * Revised the time. The date format is based on ISO8601 notation and uses UTC +0 time in the format of yyyy-MM-ddTHH:mm:ssZ.
     * 
     */
    @Export(name="gmtModified", refs={String.class}, tree="[0]")
    private Output<String> gmtModified;

    /**
     * @return Revised the time. The date format is based on ISO8601 notation and uses UTC +0 time in the format of yyyy-MM-ddTHH:mm:ssZ.
     * 
     */
    public Output<String> gmtModified() {
        return this.gmtModified;
    }
    /**
     * Blocked regions outside the Chinese mainland, separated by commas (,).
     * 
     */
    @Export(name="otherRegionList", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> otherRegionList;

    /**
     * @return Blocked regions outside the Chinese mainland, separated by commas (,).
     * 
     */
    public Output<Optional<String>> otherRegionList() {
        return Codegen.optional(this.otherRegionList);
    }
    /**
     * The protection policy ID.
     * 
     */
    @Export(name="policyId", refs={String.class}, tree="[0]")
    private Output<String> policyId;

    /**
     * @return The protection policy ID.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }
    /**
     * The rules of rate limiting. If you set `cc_status` to on, you must configure this parameter. See `rate_limit` below.
     * 
     */
    @Export(name="rateLimit", refs={WafRuleRateLimit.class}, tree="[0]")
    private Output</* @Nullable */ WafRuleRateLimit> rateLimit;

    /**
     * @return The rules of rate limiting. If you set `cc_status` to on, you must configure this parameter. See `rate_limit` below.
     * 
     */
    public Output<Optional<WafRuleRateLimit>> rateLimit() {
        return Codegen.optional(this.rateLimit);
    }
    /**
     * The regular expression.e, when waf_group appears in tags, this value can be filled in, and only one list of six digits in string format can appear with regultypes.
     * 
     */
    @Export(name="regularRules", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> regularRules;

    /**
     * @return The regular expression.e, when waf_group appears in tags, this value can be filled in, and only one list of six digits in string format can appear with regultypes.
     * 
     */
    public Output<Optional<List<String>>> regularRules() {
        return Codegen.optional(this.regularRules);
    }
    /**
     * Regular rule type, when waf_group appears in tags, this value can be filled in, optional values:[&#34;sqli&#34;, &#34;xss&#34;, &#34;code_exec&#34;, &#34;crlf&#34;, &#34;lfileii&#34;, &#34;rfileii&#34;, &#34;webshell&#34;, &#34;vvip&#34;, &#34;other&#34;]
     * 
     */
    @Export(name="regularTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> regularTypes;

    /**
     * @return Regular rule type, when waf_group appears in tags, this value can be filled in, optional values:[&#34;sqli&#34;, &#34;xss&#34;, &#34;code_exec&#34;, &#34;crlf&#34;, &#34;lfileii&#34;, &#34;rfileii&#34;, &#34;webshell&#34;, &#34;vvip&#34;, &#34;other&#34;]
     * 
     */
    public Output<Optional<List<String>>> regularTypes() {
        return Codegen.optional(this.regularTypes);
    }
    /**
     * Filter by IP address.
     * 
     */
    @Export(name="remoteAddrs", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> remoteAddrs;

    /**
     * @return Filter by IP address.
     * 
     */
    public Output<Optional<List<String>>> remoteAddrs() {
        return Codegen.optional(this.remoteAddrs);
    }
    /**
     * The name of the protection rule. The name can be up to 64 characters in length and can contain letters, digits, and underscores (_). **NOTE:** This parameter cannot be modified when policy is of type `region_block`.
     * 
     */
    @Export(name="ruleName", refs={String.class}, tree="[0]")
    private Output<String> ruleName;

    /**
     * @return The name of the protection rule. The name can be up to 64 characters in length and can contain letters, digits, and underscores (_). **NOTE:** This parameter cannot be modified when policy is of type `region_block`.
     * 
     */
    public Output<String> ruleName() {
        return this.ruleName;
    }
    /**
     * The types of the protection policies.
     * 
     */
    @Export(name="scenes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> scenes;

    /**
     * @return The types of the protection policies.
     * 
     */
    public Output<Optional<List<String>>> scenes() {
        return Codegen.optional(this.scenes);
    }
    /**
     * The status of the waf rule. Valid values: `on` and `off`. Default value: on.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the waf rule. Valid values: `on` and `off`. Default value: on.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The id of the waf rule group. The default value is &#34;1012&#34;. Multiple rules are separated by commas. **NOTE:** This parameter is valid only when policy is of type `waf_group`.
     * 
     */
    @Export(name="wafGroupIds", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> wafGroupIds;

    /**
     * @return The id of the waf rule group. The default value is &#34;1012&#34;. Multiple rules are separated by commas. **NOTE:** This parameter is valid only when policy is of type `waf_group`.
     * 
     */
    public Output<Optional<String>> wafGroupIds() {
        return Codegen.optional(this.wafGroupIds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WafRule(java.lang.String name) {
        this(name, WafRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WafRule(java.lang.String name, WafRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WafRule(java.lang.String name, WafRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dcdn/wafRule:WafRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WafRule(java.lang.String name, Output<java.lang.String> id, @Nullable WafRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dcdn/wafRule:WafRule", name, state, makeResourceOptions(options, id), false);
    }

    private static WafRuleArgs makeArgs(WafRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WafRuleArgs.Empty : args;
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
    public static WafRule get(java.lang.String name, Output<java.lang.String> id, @Nullable WafRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WafRule(name, id, state, options);
    }
}
