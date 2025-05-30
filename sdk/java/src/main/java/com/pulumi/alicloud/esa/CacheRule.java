// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.esa.CacheRuleArgs;
import com.pulumi.alicloud.esa.inputs.CacheRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ESA Cache Rule resource.
 * 
 * For information about ESA Cache Rule and how to use it, see [What is Cache Rule](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CreateCacheRule).
 * 
 * &gt; **NOTE:** Available since v1.244.0.
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
 * import com.pulumi.alicloud.esa.EsaFunctions;
 * import com.pulumi.alicloud.esa.inputs.GetSitesArgs;
 * import com.pulumi.alicloud.esa.CacheRule;
 * import com.pulumi.alicloud.esa.CacheRuleArgs;
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
 *         final var default = EsaFunctions.getSites(GetSitesArgs.builder()
 *             .planSubscribeType("enterpriseplan")
 *             .build());
 * 
 *         var defaultCacheRule = new CacheRule("defaultCacheRule", CacheRuleArgs.builder()
 *             .userDeviceType("off")
 *             .browserCacheMode("no_cache")
 *             .userLanguage("off")
 *             .checkPresenceHeader("headername")
 *             .includeCookie("cookie_exapmle")
 *             .edgeCacheMode("follow_origin")
 *             .additionalCacheablePorts("2053")
 *             .ruleName("rule_example")
 *             .edgeStatusCodeCacheTtl("300")
 *             .browserCacheTtl("300")
 *             .queryString("example")
 *             .userGeo("off")
 *             .sortQueryStringForCache("off")
 *             .checkPresenceCookie("cookiename")
 *             .cacheReserveEligibility("bypass_cache_reserve")
 *             .queryStringMode("ignore_all")
 *             .rule("http.host eq \"video.example.com\"")
 *             .cacheDeceptionArmor("off")
 *             .siteId(default_.sites()[0].id())
 *             .bypassCache("cache_all")
 *             .edgeCacheTtl("300")
 *             .ruleEnable("off")
 *             .siteVersion(0)
 *             .includeHeader("example")
 *             .serveStale("off")
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
 * ESA Cache Rule can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:esa/cacheRule:CacheRule example &lt;site_id&gt;:&lt;cache_rule_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:esa/cacheRule:CacheRule")
public class CacheRule extends com.pulumi.resources.CustomResource {
    /**
     * Enable caching on specified ports. Value range: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, 2096
     * 
     */
    @Export(name="additionalCacheablePorts", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> additionalCacheablePorts;

    /**
     * @return Enable caching on specified ports. Value range: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, 2096
     * 
     */
    public Output<Optional<String>> additionalCacheablePorts() {
        return Codegen.optional(this.additionalCacheablePorts);
    }
    /**
     * Browser cache mode. Possible values:
     * 
     */
    @Export(name="browserCacheMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> browserCacheMode;

    /**
     * @return Browser cache mode. Possible values:
     * 
     */
    public Output<Optional<String>> browserCacheMode() {
        return Codegen.optional(this.browserCacheMode);
    }
    /**
     * Browser cache expiration time in seconds.
     * 
     */
    @Export(name="browserCacheTtl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> browserCacheTtl;

    /**
     * @return Browser cache expiration time in seconds.
     * 
     */
    public Output<Optional<String>> browserCacheTtl() {
        return Codegen.optional(this.browserCacheTtl);
    }
    /**
     * Set the bypass cache mode. Possible values:
     * 
     */
    @Export(name="bypassCache", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bypassCache;

    /**
     * @return Set the bypass cache mode. Possible values:
     * 
     */
    public Output<Optional<String>> bypassCache() {
        return Codegen.optional(this.bypassCache);
    }
    /**
     * Cache deception protection. Used to defend against web cache deception attacks, only the cache content that passes the validation will be cached. Value range:
     * 
     */
    @Export(name="cacheDeceptionArmor", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cacheDeceptionArmor;

    /**
     * @return Cache deception protection. Used to defend against web cache deception attacks, only the cache content that passes the validation will be cached. Value range:
     * 
     */
    public Output<Optional<String>> cacheDeceptionArmor() {
        return Codegen.optional(this.cacheDeceptionArmor);
    }
    /**
     * Cache retention eligibility. Used to control whether user requests bypass the cache retention node when returning to the origin. Possible values:
     * 
     */
    @Export(name="cacheReserveEligibility", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cacheReserveEligibility;

    /**
     * @return Cache retention eligibility. Used to control whether user requests bypass the cache retention node when returning to the origin. Possible values:
     * 
     */
    public Output<Optional<String>> cacheReserveEligibility() {
        return Codegen.optional(this.cacheReserveEligibility);
    }
    /**
     * Cache Rule Id.
     * 
     */
    @Export(name="cacheRuleId", refs={Integer.class}, tree="[0]")
    private Output<Integer> cacheRuleId;

    /**
     * @return Cache Rule Id.
     * 
     */
    public Output<Integer> cacheRuleId() {
        return this.cacheRuleId;
    }
    /**
     * When generating the cache key, check if the cookie exists. If it does, add the cookie name (case-insensitive) to the cache key. Multiple cookie names are supported, separated by spaces.
     * 
     */
    @Export(name="checkPresenceCookie", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> checkPresenceCookie;

    /**
     * @return When generating the cache key, check if the cookie exists. If it does, add the cookie name (case-insensitive) to the cache key. Multiple cookie names are supported, separated by spaces.
     * 
     */
    public Output<Optional<String>> checkPresenceCookie() {
        return Codegen.optional(this.checkPresenceCookie);
    }
    /**
     * When generating the cache key, check if the header exists. If it does, add the header name (case-insensitive) to the cache key. Multiple header names are supported, separated by spaces.
     * 
     */
    @Export(name="checkPresenceHeader", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> checkPresenceHeader;

    /**
     * @return When generating the cache key, check if the header exists. If it does, add the header name (case-insensitive) to the cache key. Multiple header names are supported, separated by spaces.
     * 
     */
    public Output<Optional<String>> checkPresenceHeader() {
        return Codegen.optional(this.checkPresenceHeader);
    }
    /**
     * Edge cache mode. Possible values:
     * 
     */
    @Export(name="edgeCacheMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> edgeCacheMode;

    /**
     * @return Edge cache mode. Possible values:
     * 
     */
    public Output<Optional<String>> edgeCacheMode() {
        return Codegen.optional(this.edgeCacheMode);
    }
    /**
     * Edge cache expiration time in seconds.
     * 
     */
    @Export(name="edgeCacheTtl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> edgeCacheTtl;

    /**
     * @return Edge cache expiration time in seconds.
     * 
     */
    public Output<Optional<String>> edgeCacheTtl() {
        return Codegen.optional(this.edgeCacheTtl);
    }
    /**
     * Status code cache expiration time in seconds.
     * 
     */
    @Export(name="edgeStatusCodeCacheTtl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> edgeStatusCodeCacheTtl;

    /**
     * @return Status code cache expiration time in seconds.
     * 
     */
    public Output<Optional<String>> edgeStatusCodeCacheTtl() {
        return Codegen.optional(this.edgeStatusCodeCacheTtl);
    }
    /**
     * When generating the cache key, add the specified cookie names and their values. Multiple values are supported, separated by spaces.
     * 
     */
    @Export(name="includeCookie", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> includeCookie;

    /**
     * @return When generating the cache key, add the specified cookie names and their values. Multiple values are supported, separated by spaces.
     * 
     */
    public Output<Optional<String>> includeCookie() {
        return Codegen.optional(this.includeCookie);
    }
    /**
     * When generating the cache key, add the specified header names and their values. Multiple values are supported, separated by spaces.
     * 
     */
    @Export(name="includeHeader", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> includeHeader;

    /**
     * @return When generating the cache key, add the specified header names and their values. Multiple values are supported, separated by spaces.
     * 
     */
    public Output<Optional<String>> includeHeader() {
        return Codegen.optional(this.includeHeader);
    }
    /**
     * Query strings to be reserved or excluded. Multiple values are supported, separated by spaces.
     * 
     */
    @Export(name="queryString", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> queryString;

    /**
     * @return Query strings to be reserved or excluded. Multiple values are supported, separated by spaces.
     * 
     */
    public Output<Optional<String>> queryString() {
        return Codegen.optional(this.queryString);
    }
    /**
     * The processing mode for query strings when generating the cache key. Possible values:
     * 
     */
    @Export(name="queryStringMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> queryStringMode;

    /**
     * @return The processing mode for query strings when generating the cache key. Possible values:
     * 
     */
    public Output<Optional<String>> queryStringMode() {
        return Codegen.optional(this.queryStringMode);
    }
    /**
     * Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
     * - Match all incoming requests: value set to true.
     * - Match specified request: Set the value to a custom expression, for example: (http.host eq \&#34;video.example.com\&#34;).
     * 
     */
    @Export(name="rule", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rule;

    /**
     * @return Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
     * - Match all incoming requests: value set to true.
     * - Match specified request: Set the value to a custom expression, for example: (http.host eq \&#34;video.example.com\&#34;).
     * 
     */
    public Output<Optional<String>> rule() {
        return Codegen.optional(this.rule);
    }
    /**
     * Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
     * 
     */
    @Export(name="ruleEnable", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ruleEnable;

    /**
     * @return Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
     * 
     */
    public Output<Optional<String>> ruleEnable() {
        return Codegen.optional(this.ruleEnable);
    }
    /**
     * Rule name. When adding global configuration, this parameter does not need to be set.
     * 
     */
    @Export(name="ruleName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ruleName;

    /**
     * @return Rule name. When adding global configuration, this parameter does not need to be set.
     * 
     */
    public Output<Optional<String>> ruleName() {
        return Codegen.optional(this.ruleName);
    }
    /**
     * Serve stale cache. When enabled, the node can still respond to user requests with expired cached files when the origin server is unavailable. Value range:
     * 
     */
    @Export(name="serveStale", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serveStale;

    /**
     * @return Serve stale cache. When enabled, the node can still respond to user requests with expired cached files when the origin server is unavailable. Value range:
     * 
     */
    public Output<Optional<String>> serveStale() {
        return Codegen.optional(this.serveStale);
    }
    /**
     * The site ID, which can be obtained by calling the [ListSites] API.
     * 
     */
    @Export(name="siteId", refs={Integer.class}, tree="[0]")
    private Output<Integer> siteId;

    /**
     * @return The site ID, which can be obtained by calling the [ListSites] API.
     * 
     */
    public Output<Integer> siteId() {
        return this.siteId;
    }
    /**
     * The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
     * 
     */
    @Export(name="siteVersion", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> siteVersion;

    /**
     * @return The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
     * 
     */
    public Output<Optional<Integer>> siteVersion() {
        return Codegen.optional(this.siteVersion);
    }
    /**
     * Query string sorting, disabled by default. Possible values:
     * 
     */
    @Export(name="sortQueryStringForCache", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sortQueryStringForCache;

    /**
     * @return Query string sorting, disabled by default. Possible values:
     * 
     */
    public Output<Optional<String>> sortQueryStringForCache() {
        return Codegen.optional(this.sortQueryStringForCache);
    }
    /**
     * When generating the cache key, add the client device type. Possible values:
     * 
     */
    @Export(name="userDeviceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userDeviceType;

    /**
     * @return When generating the cache key, add the client device type. Possible values:
     * 
     */
    public Output<Optional<String>> userDeviceType() {
        return Codegen.optional(this.userDeviceType);
    }
    /**
     * When generating the cache key, add the client&#39;s geographic location. Possible values:
     * 
     */
    @Export(name="userGeo", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userGeo;

    /**
     * @return When generating the cache key, add the client&#39;s geographic location. Possible values:
     * 
     */
    public Output<Optional<String>> userGeo() {
        return Codegen.optional(this.userGeo);
    }
    /**
     * When generating cache keys, include the client&#39;s language type. Possible values:
     * 
     */
    @Export(name="userLanguage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userLanguage;

    /**
     * @return When generating cache keys, include the client&#39;s language type. Possible values:
     * 
     */
    public Output<Optional<String>> userLanguage() {
        return Codegen.optional(this.userLanguage);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CacheRule(java.lang.String name) {
        this(name, CacheRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CacheRule(java.lang.String name, CacheRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CacheRule(java.lang.String name, CacheRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:esa/cacheRule:CacheRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CacheRule(java.lang.String name, Output<java.lang.String> id, @Nullable CacheRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:esa/cacheRule:CacheRule", name, state, makeResourceOptions(options, id), false);
    }

    private static CacheRuleArgs makeArgs(CacheRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CacheRuleArgs.Empty : args;
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
    public static CacheRule get(java.lang.String name, Output<java.lang.String> id, @Nullable CacheRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CacheRule(name, id, state, options);
    }
}
