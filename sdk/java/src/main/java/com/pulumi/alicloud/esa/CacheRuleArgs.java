// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CacheRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheRuleArgs Empty = new CacheRuleArgs();

    /**
     * Enable caching on specified ports. Value range: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, 2096
     * 
     */
    @Import(name="additionalCacheablePorts")
    private @Nullable Output<String> additionalCacheablePorts;

    /**
     * @return Enable caching on specified ports. Value range: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, 2096
     * 
     */
    public Optional<Output<String>> additionalCacheablePorts() {
        return Optional.ofNullable(this.additionalCacheablePorts);
    }

    /**
     * Browser cache mode. Possible values:
     * 
     */
    @Import(name="browserCacheMode")
    private @Nullable Output<String> browserCacheMode;

    /**
     * @return Browser cache mode. Possible values:
     * 
     */
    public Optional<Output<String>> browserCacheMode() {
        return Optional.ofNullable(this.browserCacheMode);
    }

    /**
     * Browser cache expiration time in seconds.
     * 
     */
    @Import(name="browserCacheTtl")
    private @Nullable Output<String> browserCacheTtl;

    /**
     * @return Browser cache expiration time in seconds.
     * 
     */
    public Optional<Output<String>> browserCacheTtl() {
        return Optional.ofNullable(this.browserCacheTtl);
    }

    /**
     * Set the bypass cache mode. Possible values:
     * 
     */
    @Import(name="bypassCache")
    private @Nullable Output<String> bypassCache;

    /**
     * @return Set the bypass cache mode. Possible values:
     * 
     */
    public Optional<Output<String>> bypassCache() {
        return Optional.ofNullable(this.bypassCache);
    }

    /**
     * Cache deception protection. Used to defend against web cache deception attacks, only the cache content that passes the validation will be cached. Value range:
     * 
     */
    @Import(name="cacheDeceptionArmor")
    private @Nullable Output<String> cacheDeceptionArmor;

    /**
     * @return Cache deception protection. Used to defend against web cache deception attacks, only the cache content that passes the validation will be cached. Value range:
     * 
     */
    public Optional<Output<String>> cacheDeceptionArmor() {
        return Optional.ofNullable(this.cacheDeceptionArmor);
    }

    /**
     * Cache retention eligibility. Used to control whether user requests bypass the cache retention node when returning to the origin. Possible values:
     * 
     */
    @Import(name="cacheReserveEligibility")
    private @Nullable Output<String> cacheReserveEligibility;

    /**
     * @return Cache retention eligibility. Used to control whether user requests bypass the cache retention node when returning to the origin. Possible values:
     * 
     */
    public Optional<Output<String>> cacheReserveEligibility() {
        return Optional.ofNullable(this.cacheReserveEligibility);
    }

    /**
     * When generating the cache key, check if the cookie exists. If it does, add the cookie name (case-insensitive) to the cache key. Multiple cookie names are supported, separated by spaces.
     * 
     */
    @Import(name="checkPresenceCookie")
    private @Nullable Output<String> checkPresenceCookie;

    /**
     * @return When generating the cache key, check if the cookie exists. If it does, add the cookie name (case-insensitive) to the cache key. Multiple cookie names are supported, separated by spaces.
     * 
     */
    public Optional<Output<String>> checkPresenceCookie() {
        return Optional.ofNullable(this.checkPresenceCookie);
    }

    /**
     * When generating the cache key, check if the header exists. If it does, add the header name (case-insensitive) to the cache key. Multiple header names are supported, separated by spaces.
     * 
     */
    @Import(name="checkPresenceHeader")
    private @Nullable Output<String> checkPresenceHeader;

    /**
     * @return When generating the cache key, check if the header exists. If it does, add the header name (case-insensitive) to the cache key. Multiple header names are supported, separated by spaces.
     * 
     */
    public Optional<Output<String>> checkPresenceHeader() {
        return Optional.ofNullable(this.checkPresenceHeader);
    }

    /**
     * Edge cache mode. Possible values:
     * 
     */
    @Import(name="edgeCacheMode")
    private @Nullable Output<String> edgeCacheMode;

    /**
     * @return Edge cache mode. Possible values:
     * 
     */
    public Optional<Output<String>> edgeCacheMode() {
        return Optional.ofNullable(this.edgeCacheMode);
    }

    /**
     * Edge cache expiration time in seconds.
     * 
     */
    @Import(name="edgeCacheTtl")
    private @Nullable Output<String> edgeCacheTtl;

    /**
     * @return Edge cache expiration time in seconds.
     * 
     */
    public Optional<Output<String>> edgeCacheTtl() {
        return Optional.ofNullable(this.edgeCacheTtl);
    }

    /**
     * Status code cache expiration time in seconds.
     * 
     */
    @Import(name="edgeStatusCodeCacheTtl")
    private @Nullable Output<String> edgeStatusCodeCacheTtl;

    /**
     * @return Status code cache expiration time in seconds.
     * 
     */
    public Optional<Output<String>> edgeStatusCodeCacheTtl() {
        return Optional.ofNullable(this.edgeStatusCodeCacheTtl);
    }

    /**
     * When generating the cache key, add the specified cookie names and their values. Multiple values are supported, separated by spaces.
     * 
     */
    @Import(name="includeCookie")
    private @Nullable Output<String> includeCookie;

    /**
     * @return When generating the cache key, add the specified cookie names and their values. Multiple values are supported, separated by spaces.
     * 
     */
    public Optional<Output<String>> includeCookie() {
        return Optional.ofNullable(this.includeCookie);
    }

    /**
     * When generating the cache key, add the specified header names and their values. Multiple values are supported, separated by spaces.
     * 
     */
    @Import(name="includeHeader")
    private @Nullable Output<String> includeHeader;

    /**
     * @return When generating the cache key, add the specified header names and their values. Multiple values are supported, separated by spaces.
     * 
     */
    public Optional<Output<String>> includeHeader() {
        return Optional.ofNullable(this.includeHeader);
    }

    /**
     * Query strings to be reserved or excluded. Multiple values are supported, separated by spaces.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<String> queryString;

    /**
     * @return Query strings to be reserved or excluded. Multiple values are supported, separated by spaces.
     * 
     */
    public Optional<Output<String>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * The processing mode for query strings when generating the cache key. Possible values:
     * 
     */
    @Import(name="queryStringMode")
    private @Nullable Output<String> queryStringMode;

    /**
     * @return The processing mode for query strings when generating the cache key. Possible values:
     * 
     */
    public Optional<Output<String>> queryStringMode() {
        return Optional.ofNullable(this.queryStringMode);
    }

    /**
     * Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
     * - Match all incoming requests: value set to true.
     * - Match specified request: Set the value to a custom expression, for example: (http.host eq \&#34;video.example.com\&#34;).
     * 
     */
    @Import(name="rule")
    private @Nullable Output<String> rule;

    /**
     * @return Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
     * - Match all incoming requests: value set to true.
     * - Match specified request: Set the value to a custom expression, for example: (http.host eq \&#34;video.example.com\&#34;).
     * 
     */
    public Optional<Output<String>> rule() {
        return Optional.ofNullable(this.rule);
    }

    /**
     * Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
     * 
     */
    @Import(name="ruleEnable")
    private @Nullable Output<String> ruleEnable;

    /**
     * @return Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
     * 
     */
    public Optional<Output<String>> ruleEnable() {
        return Optional.ofNullable(this.ruleEnable);
    }

    /**
     * Rule name. When adding global configuration, this parameter does not need to be set.
     * 
     */
    @Import(name="ruleName")
    private @Nullable Output<String> ruleName;

    /**
     * @return Rule name. When adding global configuration, this parameter does not need to be set.
     * 
     */
    public Optional<Output<String>> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }

    /**
     * Serve stale cache. When enabled, the node can still respond to user requests with expired cached files when the origin server is unavailable. Value range:
     * 
     */
    @Import(name="serveStale")
    private @Nullable Output<String> serveStale;

    /**
     * @return Serve stale cache. When enabled, the node can still respond to user requests with expired cached files when the origin server is unavailable. Value range:
     * 
     */
    public Optional<Output<String>> serveStale() {
        return Optional.ofNullable(this.serveStale);
    }

    /**
     * The site ID, which can be obtained by calling the [ListSites] API.
     * 
     */
    @Import(name="siteId", required=true)
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
    @Import(name="siteVersion")
    private @Nullable Output<Integer> siteVersion;

    /**
     * @return The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
     * 
     */
    public Optional<Output<Integer>> siteVersion() {
        return Optional.ofNullable(this.siteVersion);
    }

    /**
     * Query string sorting, disabled by default. Possible values:
     * 
     */
    @Import(name="sortQueryStringForCache")
    private @Nullable Output<String> sortQueryStringForCache;

    /**
     * @return Query string sorting, disabled by default. Possible values:
     * 
     */
    public Optional<Output<String>> sortQueryStringForCache() {
        return Optional.ofNullable(this.sortQueryStringForCache);
    }

    /**
     * When generating the cache key, add the client device type. Possible values:
     * 
     */
    @Import(name="userDeviceType")
    private @Nullable Output<String> userDeviceType;

    /**
     * @return When generating the cache key, add the client device type. Possible values:
     * 
     */
    public Optional<Output<String>> userDeviceType() {
        return Optional.ofNullable(this.userDeviceType);
    }

    /**
     * When generating the cache key, add the client&#39;s geographic location. Possible values:
     * 
     */
    @Import(name="userGeo")
    private @Nullable Output<String> userGeo;

    /**
     * @return When generating the cache key, add the client&#39;s geographic location. Possible values:
     * 
     */
    public Optional<Output<String>> userGeo() {
        return Optional.ofNullable(this.userGeo);
    }

    /**
     * When generating cache keys, include the client&#39;s language type. Possible values:
     * 
     */
    @Import(name="userLanguage")
    private @Nullable Output<String> userLanguage;

    /**
     * @return When generating cache keys, include the client&#39;s language type. Possible values:
     * 
     */
    public Optional<Output<String>> userLanguage() {
        return Optional.ofNullable(this.userLanguage);
    }

    private CacheRuleArgs() {}

    private CacheRuleArgs(CacheRuleArgs $) {
        this.additionalCacheablePorts = $.additionalCacheablePorts;
        this.browserCacheMode = $.browserCacheMode;
        this.browserCacheTtl = $.browserCacheTtl;
        this.bypassCache = $.bypassCache;
        this.cacheDeceptionArmor = $.cacheDeceptionArmor;
        this.cacheReserveEligibility = $.cacheReserveEligibility;
        this.checkPresenceCookie = $.checkPresenceCookie;
        this.checkPresenceHeader = $.checkPresenceHeader;
        this.edgeCacheMode = $.edgeCacheMode;
        this.edgeCacheTtl = $.edgeCacheTtl;
        this.edgeStatusCodeCacheTtl = $.edgeStatusCodeCacheTtl;
        this.includeCookie = $.includeCookie;
        this.includeHeader = $.includeHeader;
        this.queryString = $.queryString;
        this.queryStringMode = $.queryStringMode;
        this.rule = $.rule;
        this.ruleEnable = $.ruleEnable;
        this.ruleName = $.ruleName;
        this.serveStale = $.serveStale;
        this.siteId = $.siteId;
        this.siteVersion = $.siteVersion;
        this.sortQueryStringForCache = $.sortQueryStringForCache;
        this.userDeviceType = $.userDeviceType;
        this.userGeo = $.userGeo;
        this.userLanguage = $.userLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheRuleArgs $;

        public Builder() {
            $ = new CacheRuleArgs();
        }

        public Builder(CacheRuleArgs defaults) {
            $ = new CacheRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalCacheablePorts Enable caching on specified ports. Value range: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, 2096
         * 
         * @return builder
         * 
         */
        public Builder additionalCacheablePorts(@Nullable Output<String> additionalCacheablePorts) {
            $.additionalCacheablePorts = additionalCacheablePorts;
            return this;
        }

        /**
         * @param additionalCacheablePorts Enable caching on specified ports. Value range: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, 2096
         * 
         * @return builder
         * 
         */
        public Builder additionalCacheablePorts(String additionalCacheablePorts) {
            return additionalCacheablePorts(Output.of(additionalCacheablePorts));
        }

        /**
         * @param browserCacheMode Browser cache mode. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder browserCacheMode(@Nullable Output<String> browserCacheMode) {
            $.browserCacheMode = browserCacheMode;
            return this;
        }

        /**
         * @param browserCacheMode Browser cache mode. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder browserCacheMode(String browserCacheMode) {
            return browserCacheMode(Output.of(browserCacheMode));
        }

        /**
         * @param browserCacheTtl Browser cache expiration time in seconds.
         * 
         * @return builder
         * 
         */
        public Builder browserCacheTtl(@Nullable Output<String> browserCacheTtl) {
            $.browserCacheTtl = browserCacheTtl;
            return this;
        }

        /**
         * @param browserCacheTtl Browser cache expiration time in seconds.
         * 
         * @return builder
         * 
         */
        public Builder browserCacheTtl(String browserCacheTtl) {
            return browserCacheTtl(Output.of(browserCacheTtl));
        }

        /**
         * @param bypassCache Set the bypass cache mode. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder bypassCache(@Nullable Output<String> bypassCache) {
            $.bypassCache = bypassCache;
            return this;
        }

        /**
         * @param bypassCache Set the bypass cache mode. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder bypassCache(String bypassCache) {
            return bypassCache(Output.of(bypassCache));
        }

        /**
         * @param cacheDeceptionArmor Cache deception protection. Used to defend against web cache deception attacks, only the cache content that passes the validation will be cached. Value range:
         * 
         * @return builder
         * 
         */
        public Builder cacheDeceptionArmor(@Nullable Output<String> cacheDeceptionArmor) {
            $.cacheDeceptionArmor = cacheDeceptionArmor;
            return this;
        }

        /**
         * @param cacheDeceptionArmor Cache deception protection. Used to defend against web cache deception attacks, only the cache content that passes the validation will be cached. Value range:
         * 
         * @return builder
         * 
         */
        public Builder cacheDeceptionArmor(String cacheDeceptionArmor) {
            return cacheDeceptionArmor(Output.of(cacheDeceptionArmor));
        }

        /**
         * @param cacheReserveEligibility Cache retention eligibility. Used to control whether user requests bypass the cache retention node when returning to the origin. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder cacheReserveEligibility(@Nullable Output<String> cacheReserveEligibility) {
            $.cacheReserveEligibility = cacheReserveEligibility;
            return this;
        }

        /**
         * @param cacheReserveEligibility Cache retention eligibility. Used to control whether user requests bypass the cache retention node when returning to the origin. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder cacheReserveEligibility(String cacheReserveEligibility) {
            return cacheReserveEligibility(Output.of(cacheReserveEligibility));
        }

        /**
         * @param checkPresenceCookie When generating the cache key, check if the cookie exists. If it does, add the cookie name (case-insensitive) to the cache key. Multiple cookie names are supported, separated by spaces.
         * 
         * @return builder
         * 
         */
        public Builder checkPresenceCookie(@Nullable Output<String> checkPresenceCookie) {
            $.checkPresenceCookie = checkPresenceCookie;
            return this;
        }

        /**
         * @param checkPresenceCookie When generating the cache key, check if the cookie exists. If it does, add the cookie name (case-insensitive) to the cache key. Multiple cookie names are supported, separated by spaces.
         * 
         * @return builder
         * 
         */
        public Builder checkPresenceCookie(String checkPresenceCookie) {
            return checkPresenceCookie(Output.of(checkPresenceCookie));
        }

        /**
         * @param checkPresenceHeader When generating the cache key, check if the header exists. If it does, add the header name (case-insensitive) to the cache key. Multiple header names are supported, separated by spaces.
         * 
         * @return builder
         * 
         */
        public Builder checkPresenceHeader(@Nullable Output<String> checkPresenceHeader) {
            $.checkPresenceHeader = checkPresenceHeader;
            return this;
        }

        /**
         * @param checkPresenceHeader When generating the cache key, check if the header exists. If it does, add the header name (case-insensitive) to the cache key. Multiple header names are supported, separated by spaces.
         * 
         * @return builder
         * 
         */
        public Builder checkPresenceHeader(String checkPresenceHeader) {
            return checkPresenceHeader(Output.of(checkPresenceHeader));
        }

        /**
         * @param edgeCacheMode Edge cache mode. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder edgeCacheMode(@Nullable Output<String> edgeCacheMode) {
            $.edgeCacheMode = edgeCacheMode;
            return this;
        }

        /**
         * @param edgeCacheMode Edge cache mode. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder edgeCacheMode(String edgeCacheMode) {
            return edgeCacheMode(Output.of(edgeCacheMode));
        }

        /**
         * @param edgeCacheTtl Edge cache expiration time in seconds.
         * 
         * @return builder
         * 
         */
        public Builder edgeCacheTtl(@Nullable Output<String> edgeCacheTtl) {
            $.edgeCacheTtl = edgeCacheTtl;
            return this;
        }

        /**
         * @param edgeCacheTtl Edge cache expiration time in seconds.
         * 
         * @return builder
         * 
         */
        public Builder edgeCacheTtl(String edgeCacheTtl) {
            return edgeCacheTtl(Output.of(edgeCacheTtl));
        }

        /**
         * @param edgeStatusCodeCacheTtl Status code cache expiration time in seconds.
         * 
         * @return builder
         * 
         */
        public Builder edgeStatusCodeCacheTtl(@Nullable Output<String> edgeStatusCodeCacheTtl) {
            $.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
            return this;
        }

        /**
         * @param edgeStatusCodeCacheTtl Status code cache expiration time in seconds.
         * 
         * @return builder
         * 
         */
        public Builder edgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
            return edgeStatusCodeCacheTtl(Output.of(edgeStatusCodeCacheTtl));
        }

        /**
         * @param includeCookie When generating the cache key, add the specified cookie names and their values. Multiple values are supported, separated by spaces.
         * 
         * @return builder
         * 
         */
        public Builder includeCookie(@Nullable Output<String> includeCookie) {
            $.includeCookie = includeCookie;
            return this;
        }

        /**
         * @param includeCookie When generating the cache key, add the specified cookie names and their values. Multiple values are supported, separated by spaces.
         * 
         * @return builder
         * 
         */
        public Builder includeCookie(String includeCookie) {
            return includeCookie(Output.of(includeCookie));
        }

        /**
         * @param includeHeader When generating the cache key, add the specified header names and their values. Multiple values are supported, separated by spaces.
         * 
         * @return builder
         * 
         */
        public Builder includeHeader(@Nullable Output<String> includeHeader) {
            $.includeHeader = includeHeader;
            return this;
        }

        /**
         * @param includeHeader When generating the cache key, add the specified header names and their values. Multiple values are supported, separated by spaces.
         * 
         * @return builder
         * 
         */
        public Builder includeHeader(String includeHeader) {
            return includeHeader(Output.of(includeHeader));
        }

        /**
         * @param queryString Query strings to be reserved or excluded. Multiple values are supported, separated by spaces.
         * 
         * @return builder
         * 
         */
        public Builder queryString(@Nullable Output<String> queryString) {
            $.queryString = queryString;
            return this;
        }

        /**
         * @param queryString Query strings to be reserved or excluded. Multiple values are supported, separated by spaces.
         * 
         * @return builder
         * 
         */
        public Builder queryString(String queryString) {
            return queryString(Output.of(queryString));
        }

        /**
         * @param queryStringMode The processing mode for query strings when generating the cache key. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder queryStringMode(@Nullable Output<String> queryStringMode) {
            $.queryStringMode = queryStringMode;
            return this;
        }

        /**
         * @param queryStringMode The processing mode for query strings when generating the cache key. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder queryStringMode(String queryStringMode) {
            return queryStringMode(Output.of(queryStringMode));
        }

        /**
         * @param rule Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
         * - Match all incoming requests: value set to true.
         * - Match specified request: Set the value to a custom expression, for example: (http.host eq \&#34;video.example.com\&#34;).
         * 
         * @return builder
         * 
         */
        public Builder rule(@Nullable Output<String> rule) {
            $.rule = rule;
            return this;
        }

        /**
         * @param rule Rule content, using conditional expressions to match user requests. When adding global configuration, this parameter does not need to be set. There are two usage scenarios:
         * - Match all incoming requests: value set to true.
         * - Match specified request: Set the value to a custom expression, for example: (http.host eq \&#34;video.example.com\&#34;).
         * 
         * @return builder
         * 
         */
        public Builder rule(String rule) {
            return rule(Output.of(rule));
        }

        /**
         * @param ruleEnable Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
         * 
         * @return builder
         * 
         */
        public Builder ruleEnable(@Nullable Output<String> ruleEnable) {
            $.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * @param ruleEnable Rule switch. When adding global configuration, this parameter does not need to be set. Value range:
         * 
         * @return builder
         * 
         */
        public Builder ruleEnable(String ruleEnable) {
            return ruleEnable(Output.of(ruleEnable));
        }

        /**
         * @param ruleName Rule name. When adding global configuration, this parameter does not need to be set.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(@Nullable Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName Rule name. When adding global configuration, this parameter does not need to be set.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        /**
         * @param serveStale Serve stale cache. When enabled, the node can still respond to user requests with expired cached files when the origin server is unavailable. Value range:
         * 
         * @return builder
         * 
         */
        public Builder serveStale(@Nullable Output<String> serveStale) {
            $.serveStale = serveStale;
            return this;
        }

        /**
         * @param serveStale Serve stale cache. When enabled, the node can still respond to user requests with expired cached files when the origin server is unavailable. Value range:
         * 
         * @return builder
         * 
         */
        public Builder serveStale(String serveStale) {
            return serveStale(Output.of(serveStale));
        }

        /**
         * @param siteId The site ID, which can be obtained by calling the [ListSites] API.
         * 
         * @return builder
         * 
         */
        public Builder siteId(Output<Integer> siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteId The site ID, which can be obtained by calling the [ListSites] API.
         * 
         * @return builder
         * 
         */
        public Builder siteId(Integer siteId) {
            return siteId(Output.of(siteId));
        }

        /**
         * @param siteVersion The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
         * 
         * @return builder
         * 
         */
        public Builder siteVersion(@Nullable Output<Integer> siteVersion) {
            $.siteVersion = siteVersion;
            return this;
        }

        /**
         * @param siteVersion The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
         * 
         * @return builder
         * 
         */
        public Builder siteVersion(Integer siteVersion) {
            return siteVersion(Output.of(siteVersion));
        }

        /**
         * @param sortQueryStringForCache Query string sorting, disabled by default. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder sortQueryStringForCache(@Nullable Output<String> sortQueryStringForCache) {
            $.sortQueryStringForCache = sortQueryStringForCache;
            return this;
        }

        /**
         * @param sortQueryStringForCache Query string sorting, disabled by default. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder sortQueryStringForCache(String sortQueryStringForCache) {
            return sortQueryStringForCache(Output.of(sortQueryStringForCache));
        }

        /**
         * @param userDeviceType When generating the cache key, add the client device type. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder userDeviceType(@Nullable Output<String> userDeviceType) {
            $.userDeviceType = userDeviceType;
            return this;
        }

        /**
         * @param userDeviceType When generating the cache key, add the client device type. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder userDeviceType(String userDeviceType) {
            return userDeviceType(Output.of(userDeviceType));
        }

        /**
         * @param userGeo When generating the cache key, add the client&#39;s geographic location. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder userGeo(@Nullable Output<String> userGeo) {
            $.userGeo = userGeo;
            return this;
        }

        /**
         * @param userGeo When generating the cache key, add the client&#39;s geographic location. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder userGeo(String userGeo) {
            return userGeo(Output.of(userGeo));
        }

        /**
         * @param userLanguage When generating cache keys, include the client&#39;s language type. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder userLanguage(@Nullable Output<String> userLanguage) {
            $.userLanguage = userLanguage;
            return this;
        }

        /**
         * @param userLanguage When generating cache keys, include the client&#39;s language type. Possible values:
         * 
         * @return builder
         * 
         */
        public Builder userLanguage(String userLanguage) {
            return userLanguage(Output.of(userLanguage));
        }

        public CacheRuleArgs build() {
            if ($.siteId == null) {
                throw new MissingRequiredPropertyException("CacheRuleArgs", "siteId");
            }
            return $;
        }
    }

}
