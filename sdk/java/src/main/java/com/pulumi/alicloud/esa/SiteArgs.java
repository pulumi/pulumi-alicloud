// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SiteArgs extends com.pulumi.resources.ResourceArgs {

    public static final SiteArgs Empty = new SiteArgs();

    /**
     * Site Access Type
     * 
     */
    @Import(name="accessType")
    private @Nullable Output<String> accessType;

    /**
     * @return Site Access Type
     * 
     */
    public Optional<Output<String>> accessType() {
        return Optional.ofNullable(this.accessType);
    }

    /**
     * Add the Visitor geolocation header. Value range:
     * - on
     * - off
     * 
     */
    @Import(name="addClientGeolocationHeader")
    private @Nullable Output<String> addClientGeolocationHeader;

    /**
     * @return Add the Visitor geolocation header. Value range:
     * - on
     * - off
     * 
     */
    public Optional<Output<String>> addClientGeolocationHeader() {
        return Optional.ofNullable(this.addClientGeolocationHeader);
    }

    /**
     * Add the &#34;ali-real-client-ip&#34; header containing the real client IP. Value range:
     * - on
     * - off
     * 
     */
    @Import(name="addRealClientIpHeader")
    private @Nullable Output<String> addRealClientIpHeader;

    /**
     * @return Add the &#34;ali-real-client-ip&#34; header containing the real client IP. Value range:
     * - on
     * - off
     * 
     */
    public Optional<Output<String>> addRealClientIpHeader() {
        return Optional.ofNullable(this.addRealClientIpHeader);
    }

    /**
     * Multi-level cache architecture pattern. Value range:
     * edge: edge caching layer.
     * edge_smart: Edge Cache layer + Smart Cache layer.
     * edge_regional: Edge Cache layer + regional cache layer.
     * edge_regional_smart: Edge Cache layer + regional cache layer + intelligent cache layer.
     * 
     */
    @Import(name="cacheArchitectureMode")
    private @Nullable Output<String> cacheArchitectureMode;

    /**
     * @return Multi-level cache architecture pattern. Value range:
     * edge: edge caching layer.
     * edge_smart: Edge Cache layer + Smart Cache layer.
     * edge_regional: Edge Cache layer + regional cache layer.
     * edge_regional_smart: Edge Cache layer + regional cache layer + intelligent cache layer.
     * 
     */
    public Optional<Output<String>> cacheArchitectureMode() {
        return Optional.ofNullable(this.cacheArchitectureMode);
    }

    /**
     * Acceleration area
     * 
     */
    @Import(name="coverage")
    private @Nullable Output<String> coverage;

    /**
     * @return Acceleration area
     * 
     */
    public Optional<Output<String>> coverage() {
        return Optional.ofNullable(this.coverage);
    }

    /**
     * The ID of the associated package instance.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The ID of the associated package instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * IPv6 switch. Value:
     * - on
     * - off
     * 
     */
    @Import(name="ipv6Enable")
    private @Nullable Output<String> ipv6Enable;

    /**
     * @return IPv6 switch. Value:
     * - on
     * - off
     * 
     */
    public Optional<Output<String>> ipv6Enable() {
        return Optional.ofNullable(this.ipv6Enable);
    }

    /**
     * The ID of the resource group
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * Site Name
     * 
     */
    @Import(name="siteName", required=true)
    private Output<String> siteName;

    /**
     * @return Site Name
     * 
     */
    public Output<String> siteName() {
        return this.siteName;
    }

    /**
     * The version number of the site. For a site with version management enabled, you can use this parameter to specify the effective site version. The default version is 0.
     * 
     */
    @Import(name="siteVersion")
    private @Nullable Output<Integer> siteVersion;

    /**
     * @return The version number of the site. For a site with version management enabled, you can use this parameter to specify the effective site version. The default version is 0.
     * 
     */
    public Optional<Output<Integer>> siteVersion() {
        return Optional.ofNullable(this.siteVersion);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SiteArgs() {}

    private SiteArgs(SiteArgs $) {
        this.accessType = $.accessType;
        this.addClientGeolocationHeader = $.addClientGeolocationHeader;
        this.addRealClientIpHeader = $.addRealClientIpHeader;
        this.cacheArchitectureMode = $.cacheArchitectureMode;
        this.coverage = $.coverage;
        this.instanceId = $.instanceId;
        this.ipv6Enable = $.ipv6Enable;
        this.resourceGroupId = $.resourceGroupId;
        this.siteName = $.siteName;
        this.siteVersion = $.siteVersion;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SiteArgs $;

        public Builder() {
            $ = new SiteArgs();
        }

        public Builder(SiteArgs defaults) {
            $ = new SiteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessType Site Access Type
         * 
         * @return builder
         * 
         */
        public Builder accessType(@Nullable Output<String> accessType) {
            $.accessType = accessType;
            return this;
        }

        /**
         * @param accessType Site Access Type
         * 
         * @return builder
         * 
         */
        public Builder accessType(String accessType) {
            return accessType(Output.of(accessType));
        }

        /**
         * @param addClientGeolocationHeader Add the Visitor geolocation header. Value range:
         * - on
         * - off
         * 
         * @return builder
         * 
         */
        public Builder addClientGeolocationHeader(@Nullable Output<String> addClientGeolocationHeader) {
            $.addClientGeolocationHeader = addClientGeolocationHeader;
            return this;
        }

        /**
         * @param addClientGeolocationHeader Add the Visitor geolocation header. Value range:
         * - on
         * - off
         * 
         * @return builder
         * 
         */
        public Builder addClientGeolocationHeader(String addClientGeolocationHeader) {
            return addClientGeolocationHeader(Output.of(addClientGeolocationHeader));
        }

        /**
         * @param addRealClientIpHeader Add the &#34;ali-real-client-ip&#34; header containing the real client IP. Value range:
         * - on
         * - off
         * 
         * @return builder
         * 
         */
        public Builder addRealClientIpHeader(@Nullable Output<String> addRealClientIpHeader) {
            $.addRealClientIpHeader = addRealClientIpHeader;
            return this;
        }

        /**
         * @param addRealClientIpHeader Add the &#34;ali-real-client-ip&#34; header containing the real client IP. Value range:
         * - on
         * - off
         * 
         * @return builder
         * 
         */
        public Builder addRealClientIpHeader(String addRealClientIpHeader) {
            return addRealClientIpHeader(Output.of(addRealClientIpHeader));
        }

        /**
         * @param cacheArchitectureMode Multi-level cache architecture pattern. Value range:
         * edge: edge caching layer.
         * edge_smart: Edge Cache layer + Smart Cache layer.
         * edge_regional: Edge Cache layer + regional cache layer.
         * edge_regional_smart: Edge Cache layer + regional cache layer + intelligent cache layer.
         * 
         * @return builder
         * 
         */
        public Builder cacheArchitectureMode(@Nullable Output<String> cacheArchitectureMode) {
            $.cacheArchitectureMode = cacheArchitectureMode;
            return this;
        }

        /**
         * @param cacheArchitectureMode Multi-level cache architecture pattern. Value range:
         * edge: edge caching layer.
         * edge_smart: Edge Cache layer + Smart Cache layer.
         * edge_regional: Edge Cache layer + regional cache layer.
         * edge_regional_smart: Edge Cache layer + regional cache layer + intelligent cache layer.
         * 
         * @return builder
         * 
         */
        public Builder cacheArchitectureMode(String cacheArchitectureMode) {
            return cacheArchitectureMode(Output.of(cacheArchitectureMode));
        }

        /**
         * @param coverage Acceleration area
         * 
         * @return builder
         * 
         */
        public Builder coverage(@Nullable Output<String> coverage) {
            $.coverage = coverage;
            return this;
        }

        /**
         * @param coverage Acceleration area
         * 
         * @return builder
         * 
         */
        public Builder coverage(String coverage) {
            return coverage(Output.of(coverage));
        }

        /**
         * @param instanceId The ID of the associated package instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the associated package instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param ipv6Enable IPv6 switch. Value:
         * - on
         * - off
         * 
         * @return builder
         * 
         */
        public Builder ipv6Enable(@Nullable Output<String> ipv6Enable) {
            $.ipv6Enable = ipv6Enable;
            return this;
        }

        /**
         * @param ipv6Enable IPv6 switch. Value:
         * - on
         * - off
         * 
         * @return builder
         * 
         */
        public Builder ipv6Enable(String ipv6Enable) {
            return ipv6Enable(Output.of(ipv6Enable));
        }

        /**
         * @param resourceGroupId The ID of the resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param siteName Site Name
         * 
         * @return builder
         * 
         */
        public Builder siteName(Output<String> siteName) {
            $.siteName = siteName;
            return this;
        }

        /**
         * @param siteName Site Name
         * 
         * @return builder
         * 
         */
        public Builder siteName(String siteName) {
            return siteName(Output.of(siteName));
        }

        /**
         * @param siteVersion The version number of the site. For a site with version management enabled, you can use this parameter to specify the effective site version. The default version is 0.
         * 
         * @return builder
         * 
         */
        public Builder siteVersion(@Nullable Output<Integer> siteVersion) {
            $.siteVersion = siteVersion;
            return this;
        }

        /**
         * @param siteVersion The version number of the site. For a site with version management enabled, you can use this parameter to specify the effective site version. The default version is 0.
         * 
         * @return builder
         * 
         */
        public Builder siteVersion(Integer siteVersion) {
            return siteVersion(Output.of(siteVersion));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SiteArgs build() {
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("SiteArgs", "instanceId");
            }
            if ($.siteName == null) {
                throw new MissingRequiredPropertyException("SiteArgs", "siteName");
            }
            return $;
        }
    }

}
