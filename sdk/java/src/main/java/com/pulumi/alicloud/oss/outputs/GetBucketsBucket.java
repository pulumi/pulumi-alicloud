// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.outputs;

import com.pulumi.alicloud.oss.outputs.GetBucketsBucketCorsRule;
import com.pulumi.alicloud.oss.outputs.GetBucketsBucketLifecycleRule;
import com.pulumi.alicloud.oss.outputs.GetBucketsBucketLogging;
import com.pulumi.alicloud.oss.outputs.GetBucketsBucketRefererConfig;
import com.pulumi.alicloud.oss.outputs.GetBucketsBucketServerSideEncryptionRule;
import com.pulumi.alicloud.oss.outputs.GetBucketsBucketVersioning;
import com.pulumi.alicloud.oss.outputs.GetBucketsBucketWebsite;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBucketsBucket {
    /**
     * @return Bucket access control list. Possible values: `private`, `public-read` and `public-read-write`.
     * 
     */
    private final String acl;
    /**
     * @return A list of CORS rule configurations. Each element contains the following attributes:
     * 
     */
    private final List<GetBucketsBucketCorsRule> corsRules;
    /**
     * @return Bucket creation date.
     * 
     */
    private final String creationDate;
    /**
     * @return Internet domain name for accessing the bucket from outside.
     * 
     */
    private final String extranetEndpoint;
    /**
     * @return Intranet domain name for accessing the bucket from an ECS instance in the same region.
     * 
     */
    private final String intranetEndpoint;
    /**
     * @return A list CORS of lifecycle configurations. When Lifecycle is enabled, OSS automatically deletes the objects or transitions the objects (to another storage class) corresponding the lifecycle rules on a regular basis. Each element contains the following attributes:
     * 
     */
    private final List<GetBucketsBucketLifecycleRule> lifecycleRules;
    /**
     * @return Region of the data center where the bucket is located.
     * 
     */
    private final String location;
    /**
     * @return A list of one element containing configuration parameters used for storing access log information. It contains the following attributes:
     * 
     */
    private final GetBucketsBucketLogging logging;
    /**
     * @return Bucket name.
     * 
     */
    private final String name;
    /**
     * @return Bucket owner.
     * 
     */
    private final String owner;
    private final @Nullable String policy;
    /**
     * @return Redundancy type. Possible values: `LRS`, and `ZRS`.
     * 
     */
    private final String redundancyType;
    /**
     * @return A list of one element containing referer configuration. It contains the following attributes:
     * 
     */
    private final GetBucketsBucketRefererConfig refererConfig;
    /**
     * @return A configuration of default encryption for a bucket. It contains the following attributes:
     * 
     */
    private final GetBucketsBucketServerSideEncryptionRule serverSideEncryptionRule;
    /**
     * @return Object storage type. Possible values: `Standard`, `IA` and `Archive`.
     * 
     */
    private final String storageClass;
    /**
     * @return A mapping of tags.
     * 
     */
    private final Map<String,Object> tags;
    /**
     * @return If present , the versioning state has been set on the bucket. It contains the following attribute.
     * 
     */
    private final GetBucketsBucketVersioning versioning;
    /**
     * @return A list of one element containing configuration parameters used when the bucket is used as a website. It contains the following attributes:
     * 
     */
    private final GetBucketsBucketWebsite website;

    @CustomType.Constructor
    private GetBucketsBucket(
        @CustomType.Parameter("acl") String acl,
        @CustomType.Parameter("corsRules") List<GetBucketsBucketCorsRule> corsRules,
        @CustomType.Parameter("creationDate") String creationDate,
        @CustomType.Parameter("extranetEndpoint") String extranetEndpoint,
        @CustomType.Parameter("intranetEndpoint") String intranetEndpoint,
        @CustomType.Parameter("lifecycleRules") List<GetBucketsBucketLifecycleRule> lifecycleRules,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("logging") GetBucketsBucketLogging logging,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("owner") String owner,
        @CustomType.Parameter("policy") @Nullable String policy,
        @CustomType.Parameter("redundancyType") String redundancyType,
        @CustomType.Parameter("refererConfig") GetBucketsBucketRefererConfig refererConfig,
        @CustomType.Parameter("serverSideEncryptionRule") GetBucketsBucketServerSideEncryptionRule serverSideEncryptionRule,
        @CustomType.Parameter("storageClass") String storageClass,
        @CustomType.Parameter("tags") Map<String,Object> tags,
        @CustomType.Parameter("versioning") GetBucketsBucketVersioning versioning,
        @CustomType.Parameter("website") GetBucketsBucketWebsite website) {
        this.acl = acl;
        this.corsRules = corsRules;
        this.creationDate = creationDate;
        this.extranetEndpoint = extranetEndpoint;
        this.intranetEndpoint = intranetEndpoint;
        this.lifecycleRules = lifecycleRules;
        this.location = location;
        this.logging = logging;
        this.name = name;
        this.owner = owner;
        this.policy = policy;
        this.redundancyType = redundancyType;
        this.refererConfig = refererConfig;
        this.serverSideEncryptionRule = serverSideEncryptionRule;
        this.storageClass = storageClass;
        this.tags = tags;
        this.versioning = versioning;
        this.website = website;
    }

    /**
     * @return Bucket access control list. Possible values: `private`, `public-read` and `public-read-write`.
     * 
     */
    public String acl() {
        return this.acl;
    }
    /**
     * @return A list of CORS rule configurations. Each element contains the following attributes:
     * 
     */
    public List<GetBucketsBucketCorsRule> corsRules() {
        return this.corsRules;
    }
    /**
     * @return Bucket creation date.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return Internet domain name for accessing the bucket from outside.
     * 
     */
    public String extranetEndpoint() {
        return this.extranetEndpoint;
    }
    /**
     * @return Intranet domain name for accessing the bucket from an ECS instance in the same region.
     * 
     */
    public String intranetEndpoint() {
        return this.intranetEndpoint;
    }
    /**
     * @return A list CORS of lifecycle configurations. When Lifecycle is enabled, OSS automatically deletes the objects or transitions the objects (to another storage class) corresponding the lifecycle rules on a regular basis. Each element contains the following attributes:
     * 
     */
    public List<GetBucketsBucketLifecycleRule> lifecycleRules() {
        return this.lifecycleRules;
    }
    /**
     * @return Region of the data center where the bucket is located.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return A list of one element containing configuration parameters used for storing access log information. It contains the following attributes:
     * 
     */
    public GetBucketsBucketLogging logging() {
        return this.logging;
    }
    /**
     * @return Bucket name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Bucket owner.
     * 
     */
    public String owner() {
        return this.owner;
    }
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * @return Redundancy type. Possible values: `LRS`, and `ZRS`.
     * 
     */
    public String redundancyType() {
        return this.redundancyType;
    }
    /**
     * @return A list of one element containing referer configuration. It contains the following attributes:
     * 
     */
    public GetBucketsBucketRefererConfig refererConfig() {
        return this.refererConfig;
    }
    /**
     * @return A configuration of default encryption for a bucket. It contains the following attributes:
     * 
     */
    public GetBucketsBucketServerSideEncryptionRule serverSideEncryptionRule() {
        return this.serverSideEncryptionRule;
    }
    /**
     * @return Object storage type. Possible values: `Standard`, `IA` and `Archive`.
     * 
     */
    public String storageClass() {
        return this.storageClass;
    }
    /**
     * @return A mapping of tags.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return If present , the versioning state has been set on the bucket. It contains the following attribute.
     * 
     */
    public GetBucketsBucketVersioning versioning() {
        return this.versioning;
    }
    /**
     * @return A list of one element containing configuration parameters used when the bucket is used as a website. It contains the following attributes:
     * 
     */
    public GetBucketsBucketWebsite website() {
        return this.website;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketsBucket defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acl;
        private List<GetBucketsBucketCorsRule> corsRules;
        private String creationDate;
        private String extranetEndpoint;
        private String intranetEndpoint;
        private List<GetBucketsBucketLifecycleRule> lifecycleRules;
        private String location;
        private GetBucketsBucketLogging logging;
        private String name;
        private String owner;
        private @Nullable String policy;
        private String redundancyType;
        private GetBucketsBucketRefererConfig refererConfig;
        private GetBucketsBucketServerSideEncryptionRule serverSideEncryptionRule;
        private String storageClass;
        private Map<String,Object> tags;
        private GetBucketsBucketVersioning versioning;
        private GetBucketsBucketWebsite website;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketsBucket defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acl = defaults.acl;
    	      this.corsRules = defaults.corsRules;
    	      this.creationDate = defaults.creationDate;
    	      this.extranetEndpoint = defaults.extranetEndpoint;
    	      this.intranetEndpoint = defaults.intranetEndpoint;
    	      this.lifecycleRules = defaults.lifecycleRules;
    	      this.location = defaults.location;
    	      this.logging = defaults.logging;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.policy = defaults.policy;
    	      this.redundancyType = defaults.redundancyType;
    	      this.refererConfig = defaults.refererConfig;
    	      this.serverSideEncryptionRule = defaults.serverSideEncryptionRule;
    	      this.storageClass = defaults.storageClass;
    	      this.tags = defaults.tags;
    	      this.versioning = defaults.versioning;
    	      this.website = defaults.website;
        }

        public Builder acl(String acl) {
            this.acl = Objects.requireNonNull(acl);
            return this;
        }
        public Builder corsRules(List<GetBucketsBucketCorsRule> corsRules) {
            this.corsRules = Objects.requireNonNull(corsRules);
            return this;
        }
        public Builder corsRules(GetBucketsBucketCorsRule... corsRules) {
            return corsRules(List.of(corsRules));
        }
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        public Builder extranetEndpoint(String extranetEndpoint) {
            this.extranetEndpoint = Objects.requireNonNull(extranetEndpoint);
            return this;
        }
        public Builder intranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = Objects.requireNonNull(intranetEndpoint);
            return this;
        }
        public Builder lifecycleRules(List<GetBucketsBucketLifecycleRule> lifecycleRules) {
            this.lifecycleRules = Objects.requireNonNull(lifecycleRules);
            return this;
        }
        public Builder lifecycleRules(GetBucketsBucketLifecycleRule... lifecycleRules) {
            return lifecycleRules(List.of(lifecycleRules));
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder logging(GetBucketsBucketLogging logging) {
            this.logging = Objects.requireNonNull(logging);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }
        public Builder redundancyType(String redundancyType) {
            this.redundancyType = Objects.requireNonNull(redundancyType);
            return this;
        }
        public Builder refererConfig(GetBucketsBucketRefererConfig refererConfig) {
            this.refererConfig = Objects.requireNonNull(refererConfig);
            return this;
        }
        public Builder serverSideEncryptionRule(GetBucketsBucketServerSideEncryptionRule serverSideEncryptionRule) {
            this.serverSideEncryptionRule = Objects.requireNonNull(serverSideEncryptionRule);
            return this;
        }
        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder versioning(GetBucketsBucketVersioning versioning) {
            this.versioning = Objects.requireNonNull(versioning);
            return this;
        }
        public Builder website(GetBucketsBucketWebsite website) {
            this.website = Objects.requireNonNull(website);
            return this;
        }        public GetBucketsBucket build() {
            return new GetBucketsBucket(acl, corsRules, creationDate, extranetEndpoint, intranetEndpoint, lifecycleRules, location, logging, name, owner, policy, redundancyType, refererConfig, serverSideEncryptionRule, storageClass, tags, versioning, website);
        }
    }
}