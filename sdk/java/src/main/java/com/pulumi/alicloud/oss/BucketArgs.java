// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss;

import com.pulumi.alicloud.oss.inputs.BucketCorsRuleArgs;
import com.pulumi.alicloud.oss.inputs.BucketLifecycleRuleArgs;
import com.pulumi.alicloud.oss.inputs.BucketLoggingArgs;
import com.pulumi.alicloud.oss.inputs.BucketRefererConfigArgs;
import com.pulumi.alicloud.oss.inputs.BucketServerSideEncryptionRuleArgs;
import com.pulumi.alicloud.oss.inputs.BucketTransferAccelerationArgs;
import com.pulumi.alicloud.oss.inputs.BucketVersioningArgs;
import com.pulumi.alicloud.oss.inputs.BucketWebsiteArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketArgs Empty = new BucketArgs();

    /**
     * The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Can be &#34;private&#34;, &#34;public-read&#34; and &#34;public-read-write&#34;. Defaults to &#34;private&#34;.
     * 
     */
    @Import(name="acl")
    private @Nullable Output<String> acl;

    /**
     * @return The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Can be &#34;private&#34;, &#34;public-read&#34; and &#34;public-read-write&#34;. Defaults to &#34;private&#34;.
     * 
     */
    public Optional<Output<String>> acl() {
        return Optional.ofNullable(this.acl);
    }

    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * A rule of [Cross-Origin Resource Sharing](https://www.alibabacloud.com/help/doc-detail/31903.htm) (documented below). The items of core rule are no more than 10 for every OSS bucket.
     * 
     */
    @Import(name="corsRules")
    private @Nullable Output<List<BucketCorsRuleArgs>> corsRules;

    /**
     * @return A rule of [Cross-Origin Resource Sharing](https://www.alibabacloud.com/help/doc-detail/31903.htm) (documented below). The items of core rule are no more than 10 for every OSS bucket.
     * 
     */
    public Optional<Output<List<BucketCorsRuleArgs>>> corsRules() {
        return Optional.ofNullable(this.corsRules);
    }

    /**
     * A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are not recoverable. Defaults to &#34;false&#34;.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are not recoverable. Defaults to &#34;false&#34;.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
     * 
     */
    @Import(name="lifecycleRules")
    private @Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules;

    /**
     * @return A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
     * 
     */
    public Optional<Output<List<BucketLifecycleRuleArgs>>> lifecycleRules() {
        return Optional.ofNullable(this.lifecycleRules);
    }

    /**
     * A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
     * 
     */
    @Import(name="logging")
    private @Nullable Output<BucketLoggingArgs> logging;

    /**
     * @return A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
     * 
     */
    public Optional<Output<BucketLoggingArgs>> logging() {
        return Optional.ofNullable(this.logging);
    }

    /**
     * The flag of using logging enable container. Defaults true.
     * 
     * @deprecated
     * Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able.
     * 
     */
    @Deprecated /* Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able. */
    @Import(name="loggingIsenable")
    private @Nullable Output<Boolean> loggingIsenable;

    /**
     * @return The flag of using logging enable container. Defaults true.
     * 
     * @deprecated
     * Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able.
     * 
     */
    @Deprecated /* Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able. */
    public Optional<Output<Boolean>> loggingIsenable() {
        return Optional.ofNullable(this.loggingIsenable);
    }

    /**
     * Json format text of bucket policy [bucket policy management](https://www.alibabacloud.com/help/doc-detail/100680.htm).
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return Json format text of bucket policy [bucket policy management](https://www.alibabacloud.com/help/doc-detail/100680.htm).
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * The [redundancy type](https://www.alibabacloud.com/help/doc-detail/90589.htm) to enable. Can be &#34;LRS&#34;, and &#34;ZRS&#34;. Defaults to &#34;LRS&#34;.
     * 
     */
    @Import(name="redundancyType")
    private @Nullable Output<String> redundancyType;

    /**
     * @return The [redundancy type](https://www.alibabacloud.com/help/doc-detail/90589.htm) to enable. Can be &#34;LRS&#34;, and &#34;ZRS&#34;. Defaults to &#34;LRS&#34;.
     * 
     */
    public Optional<Output<String>> redundancyType() {
        return Optional.ofNullable(this.redundancyType);
    }

    /**
     * The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
     * 
     */
    @Import(name="refererConfig")
    private @Nullable Output<BucketRefererConfigArgs> refererConfig;

    /**
     * @return The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
     * 
     */
    public Optional<Output<BucketRefererConfigArgs>> refererConfig() {
        return Optional.ofNullable(this.refererConfig);
    }

    /**
     * A configuration of server-side encryption (documented below).
     * 
     */
    @Import(name="serverSideEncryptionRule")
    private @Nullable Output<BucketServerSideEncryptionRuleArgs> serverSideEncryptionRule;

    /**
     * @return A configuration of server-side encryption (documented below).
     * 
     */
    public Optional<Output<BucketServerSideEncryptionRuleArgs>> serverSideEncryptionRule() {
        return Optional.ofNullable(this.serverSideEncryptionRule);
    }

    /**
     * Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`.
     * 
     */
    @Import(name="storageClass")
    private @Nullable Output<String> storageClass;

    /**
     * @return Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`.
     * 
     */
    public Optional<Output<String>> storageClass() {
        return Optional.ofNullable(this.storageClass);
    }

    /**
     * A mapping of tags to assign to the bucket. The items are no more than 10 for a bucket.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the bucket. The items are no more than 10 for a bucket.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A transfer acceleration status of a bucket (documented below).
     * 
     */
    @Import(name="transferAcceleration")
    private @Nullable Output<BucketTransferAccelerationArgs> transferAcceleration;

    /**
     * @return A transfer acceleration status of a bucket (documented below).
     * 
     */
    public Optional<Output<BucketTransferAccelerationArgs>> transferAcceleration() {
        return Optional.ofNullable(this.transferAcceleration);
    }

    /**
     * A state of versioning (documented below).
     * 
     */
    @Import(name="versioning")
    private @Nullable Output<BucketVersioningArgs> versioning;

    /**
     * @return A state of versioning (documented below).
     * 
     */
    public Optional<Output<BucketVersioningArgs>> versioning() {
        return Optional.ofNullable(this.versioning);
    }

    /**
     * A website object(documented below).
     * 
     */
    @Import(name="website")
    private @Nullable Output<BucketWebsiteArgs> website;

    /**
     * @return A website object(documented below).
     * 
     */
    public Optional<Output<BucketWebsiteArgs>> website() {
        return Optional.ofNullable(this.website);
    }

    private BucketArgs() {}

    private BucketArgs(BucketArgs $) {
        this.acl = $.acl;
        this.bucket = $.bucket;
        this.corsRules = $.corsRules;
        this.forceDestroy = $.forceDestroy;
        this.lifecycleRules = $.lifecycleRules;
        this.logging = $.logging;
        this.loggingIsenable = $.loggingIsenable;
        this.policy = $.policy;
        this.redundancyType = $.redundancyType;
        this.refererConfig = $.refererConfig;
        this.serverSideEncryptionRule = $.serverSideEncryptionRule;
        this.storageClass = $.storageClass;
        this.tags = $.tags;
        this.transferAcceleration = $.transferAcceleration;
        this.versioning = $.versioning;
        this.website = $.website;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketArgs $;

        public Builder() {
            $ = new BucketArgs();
        }

        public Builder(BucketArgs defaults) {
            $ = new BucketArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acl The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Can be &#34;private&#34;, &#34;public-read&#34; and &#34;public-read-write&#34;. Defaults to &#34;private&#34;.
         * 
         * @return builder
         * 
         */
        public Builder acl(@Nullable Output<String> acl) {
            $.acl = acl;
            return this;
        }

        /**
         * @param acl The [canned ACL](https://www.alibabacloud.com/help/doc-detail/31898.htm) to apply. Can be &#34;private&#34;, &#34;public-read&#34; and &#34;public-read-write&#34;. Defaults to &#34;private&#34;.
         * 
         * @return builder
         * 
         */
        public Builder acl(String acl) {
            return acl(Output.of(acl));
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param corsRules A rule of [Cross-Origin Resource Sharing](https://www.alibabacloud.com/help/doc-detail/31903.htm) (documented below). The items of core rule are no more than 10 for every OSS bucket.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(@Nullable Output<List<BucketCorsRuleArgs>> corsRules) {
            $.corsRules = corsRules;
            return this;
        }

        /**
         * @param corsRules A rule of [Cross-Origin Resource Sharing](https://www.alibabacloud.com/help/doc-detail/31903.htm) (documented below). The items of core rule are no more than 10 for every OSS bucket.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(List<BucketCorsRuleArgs> corsRules) {
            return corsRules(Output.of(corsRules));
        }

        /**
         * @param corsRules A rule of [Cross-Origin Resource Sharing](https://www.alibabacloud.com/help/doc-detail/31903.htm) (documented below). The items of core rule are no more than 10 for every OSS bucket.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(BucketCorsRuleArgs... corsRules) {
            return corsRules(List.of(corsRules));
        }

        /**
         * @param forceDestroy A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are not recoverable. Defaults to &#34;false&#34;.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are not recoverable. Defaults to &#34;false&#34;.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        /**
         * @param lifecycleRules A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder lifecycleRules(@Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules) {
            $.lifecycleRules = lifecycleRules;
            return this;
        }

        /**
         * @param lifecycleRules A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder lifecycleRules(List<BucketLifecycleRuleArgs> lifecycleRules) {
            return lifecycleRules(Output.of(lifecycleRules));
        }

        /**
         * @param lifecycleRules A configuration of [object lifecycle management](https://www.alibabacloud.com/help/doc-detail/31904.htm) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder lifecycleRules(BucketLifecycleRuleArgs... lifecycleRules) {
            return lifecycleRules(List.of(lifecycleRules));
        }

        /**
         * @param logging A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder logging(@Nullable Output<BucketLoggingArgs> logging) {
            $.logging = logging;
            return this;
        }

        /**
         * @param logging A Settings of [bucket logging](https://www.alibabacloud.com/help/doc-detail/31900.htm) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder logging(BucketLoggingArgs logging) {
            return logging(Output.of(logging));
        }

        /**
         * @param loggingIsenable The flag of using logging enable container. Defaults true.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able.
         * 
         */
        @Deprecated /* Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able. */
        public Builder loggingIsenable(@Nullable Output<Boolean> loggingIsenable) {
            $.loggingIsenable = loggingIsenable;
            return this;
        }

        /**
         * @param loggingIsenable The flag of using logging enable container. Defaults true.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able.
         * 
         */
        @Deprecated /* Deprecated from 1.37.0. When `logging` is set, the bucket logging will be able. */
        public Builder loggingIsenable(Boolean loggingIsenable) {
            return loggingIsenable(Output.of(loggingIsenable));
        }

        /**
         * @param policy Json format text of bucket policy [bucket policy management](https://www.alibabacloud.com/help/doc-detail/100680.htm).
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Json format text of bucket policy [bucket policy management](https://www.alibabacloud.com/help/doc-detail/100680.htm).
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param redundancyType The [redundancy type](https://www.alibabacloud.com/help/doc-detail/90589.htm) to enable. Can be &#34;LRS&#34;, and &#34;ZRS&#34;. Defaults to &#34;LRS&#34;.
         * 
         * @return builder
         * 
         */
        public Builder redundancyType(@Nullable Output<String> redundancyType) {
            $.redundancyType = redundancyType;
            return this;
        }

        /**
         * @param redundancyType The [redundancy type](https://www.alibabacloud.com/help/doc-detail/90589.htm) to enable. Can be &#34;LRS&#34;, and &#34;ZRS&#34;. Defaults to &#34;LRS&#34;.
         * 
         * @return builder
         * 
         */
        public Builder redundancyType(String redundancyType) {
            return redundancyType(Output.of(redundancyType));
        }

        /**
         * @param refererConfig The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder refererConfig(@Nullable Output<BucketRefererConfigArgs> refererConfig) {
            $.refererConfig = refererConfig;
            return this;
        }

        /**
         * @param refererConfig The configuration of [referer](https://www.alibabacloud.com/help/doc-detail/31901.htm) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder refererConfig(BucketRefererConfigArgs refererConfig) {
            return refererConfig(Output.of(refererConfig));
        }

        /**
         * @param serverSideEncryptionRule A configuration of server-side encryption (documented below).
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryptionRule(@Nullable Output<BucketServerSideEncryptionRuleArgs> serverSideEncryptionRule) {
            $.serverSideEncryptionRule = serverSideEncryptionRule;
            return this;
        }

        /**
         * @param serverSideEncryptionRule A configuration of server-side encryption (documented below).
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryptionRule(BucketServerSideEncryptionRuleArgs serverSideEncryptionRule) {
            return serverSideEncryptionRule(Output.of(serverSideEncryptionRule));
        }

        /**
         * @param storageClass Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`.
         * 
         * @return builder
         * 
         */
        public Builder storageClass(@Nullable Output<String> storageClass) {
            $.storageClass = storageClass;
            return this;
        }

        /**
         * @param storageClass Specifies the storage class that objects that conform to the rule are converted into. The storage class of the objects in a bucket of the IA storage class can be converted into Archive but cannot be converted into Standard. Values: `IA`, `Archive`.
         * 
         * @return builder
         * 
         */
        public Builder storageClass(String storageClass) {
            return storageClass(Output.of(storageClass));
        }

        /**
         * @param tags A mapping of tags to assign to the bucket. The items are no more than 10 for a bucket.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the bucket. The items are no more than 10 for a bucket.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param transferAcceleration A transfer acceleration status of a bucket (documented below).
         * 
         * @return builder
         * 
         */
        public Builder transferAcceleration(@Nullable Output<BucketTransferAccelerationArgs> transferAcceleration) {
            $.transferAcceleration = transferAcceleration;
            return this;
        }

        /**
         * @param transferAcceleration A transfer acceleration status of a bucket (documented below).
         * 
         * @return builder
         * 
         */
        public Builder transferAcceleration(BucketTransferAccelerationArgs transferAcceleration) {
            return transferAcceleration(Output.of(transferAcceleration));
        }

        /**
         * @param versioning A state of versioning (documented below).
         * 
         * @return builder
         * 
         */
        public Builder versioning(@Nullable Output<BucketVersioningArgs> versioning) {
            $.versioning = versioning;
            return this;
        }

        /**
         * @param versioning A state of versioning (documented below).
         * 
         * @return builder
         * 
         */
        public Builder versioning(BucketVersioningArgs versioning) {
            return versioning(Output.of(versioning));
        }

        /**
         * @param website A website object(documented below).
         * 
         * @return builder
         * 
         */
        public Builder website(@Nullable Output<BucketWebsiteArgs> website) {
            $.website = website;
            return this;
        }

        /**
         * @param website A website object(documented below).
         * 
         * @return builder
         * 
         */
        public Builder website(BucketWebsiteArgs website) {
            return website(Output.of(website));
        }

        public BucketArgs build() {
            return $;
        }
    }

}