// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainCacheConfig {
    private final String cacheContent;
    private final @Nullable String cacheId;
    private final String cacheType;
    private final Integer ttl;
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private DomainCacheConfig(
        @CustomType.Parameter("cacheContent") String cacheContent,
        @CustomType.Parameter("cacheId") @Nullable String cacheId,
        @CustomType.Parameter("cacheType") String cacheType,
        @CustomType.Parameter("ttl") Integer ttl,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.cacheContent = cacheContent;
        this.cacheId = cacheId;
        this.cacheType = cacheType;
        this.ttl = ttl;
        this.weight = weight;
    }

    public String cacheContent() {
        return this.cacheContent;
    }
    public Optional<String> cacheId() {
        return Optional.ofNullable(this.cacheId);
    }
    public String cacheType() {
        return this.cacheType;
    }
    public Integer ttl() {
        return this.ttl;
    }
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainCacheConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cacheContent;
        private @Nullable String cacheId;
        private String cacheType;
        private Integer ttl;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainCacheConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheContent = defaults.cacheContent;
    	      this.cacheId = defaults.cacheId;
    	      this.cacheType = defaults.cacheType;
    	      this.ttl = defaults.ttl;
    	      this.weight = defaults.weight;
        }

        public Builder cacheContent(String cacheContent) {
            this.cacheContent = Objects.requireNonNull(cacheContent);
            return this;
        }
        public Builder cacheId(@Nullable String cacheId) {
            this.cacheId = cacheId;
            return this;
        }
        public Builder cacheType(String cacheType) {
            this.cacheType = Objects.requireNonNull(cacheType);
            return this;
        }
        public Builder ttl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public DomainCacheConfig build() {
            return new DomainCacheConfig(cacheContent, cacheId, cacheType, ttl, weight);
        }
    }
}