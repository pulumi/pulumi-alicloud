// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.inputs;

import com.pulumi.alicloud.oss.inputs.BucketLifecycleRuleAbortMultipartUploadArgs;
import com.pulumi.alicloud.oss.inputs.BucketLifecycleRuleExpirationArgs;
import com.pulumi.alicloud.oss.inputs.BucketLifecycleRuleFilterArgs;
import com.pulumi.alicloud.oss.inputs.BucketLifecycleRuleNoncurrentVersionExpirationArgs;
import com.pulumi.alicloud.oss.inputs.BucketLifecycleRuleNoncurrentVersionTransitionArgs;
import com.pulumi.alicloud.oss.inputs.BucketLifecycleRuleTransitionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleArgs Empty = new BucketLifecycleRuleArgs();

    /**
     * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed. See `abort_multipart_upload` below.
     * 
     */
    @Import(name="abortMultipartUploads")
    private @Nullable Output<List<BucketLifecycleRuleAbortMultipartUploadArgs>> abortMultipartUploads;

    /**
     * @return Specifies the number of days after initiating a multipart upload when the multipart upload must be completed. See `abort_multipart_upload` below.
     * 
     */
    public Optional<Output<List<BucketLifecycleRuleAbortMultipartUploadArgs>>> abortMultipartUploads() {
        return Optional.ofNullable(this.abortMultipartUploads);
    }

    /**
     * Specifies lifecycle rule status.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Specifies lifecycle rule status.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Specifies a period in the object&#39;s expire. See `expiration` below.
     * 
     */
    @Import(name="expirations")
    private @Nullable Output<List<BucketLifecycleRuleExpirationArgs>> expirations;

    /**
     * @return Specifies a period in the object&#39;s expire. See `expiration` below.
     * 
     */
    public Optional<Output<List<BucketLifecycleRuleExpirationArgs>>> expirations() {
        return Optional.ofNullable(this.expirations);
    }

    /**
     * Configuration block used to identify objects that a Lifecycle rule applies to. See `filter` below.
     * 
     * `NOTE`: At least one of expiration, transitions, abort_multipart_upload, noncurrent_version_expiration and noncurrent_version_transition should be configured.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<BucketLifecycleRuleFilterArgs> filter;

    /**
     * @return Configuration block used to identify objects that a Lifecycle rule applies to. See `filter` below.
     * 
     * `NOTE`: At least one of expiration, transitions, abort_multipart_upload, noncurrent_version_expiration and noncurrent_version_transition should be configured.
     * 
     */
    public Optional<Output<BucketLifecycleRuleFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Unique identifier for the rule. If omitted, OSS bucket will assign a unique name.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique identifier for the rule. If omitted, OSS bucket will assign a unique name.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Specifies when noncurrent object versions expire. See `noncurrent_version_expiration` below.
     * 
     */
    @Import(name="noncurrentVersionExpirations")
    private @Nullable Output<List<BucketLifecycleRuleNoncurrentVersionExpirationArgs>> noncurrentVersionExpirations;

    /**
     * @return Specifies when noncurrent object versions expire. See `noncurrent_version_expiration` below.
     * 
     */
    public Optional<Output<List<BucketLifecycleRuleNoncurrentVersionExpirationArgs>>> noncurrentVersionExpirations() {
        return Optional.ofNullable(this.noncurrentVersionExpirations);
    }

    /**
     * Specifies when noncurrent object versions transitions. See `noncurrent_version_transition` below.
     * 
     */
    @Import(name="noncurrentVersionTransitions")
    private @Nullable Output<List<BucketLifecycleRuleNoncurrentVersionTransitionArgs>> noncurrentVersionTransitions;

    /**
     * @return Specifies when noncurrent object versions transitions. See `noncurrent_version_transition` below.
     * 
     */
    public Optional<Output<List<BucketLifecycleRuleNoncurrentVersionTransitionArgs>>> noncurrentVersionTransitions() {
        return Optional.ofNullable(this.noncurrentVersionTransitions);
    }

    /**
     * The prefix in the names of the objects to which the lifecycle rule does not apply.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return The prefix in the names of the objects to which the lifecycle rule does not apply.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * Key-value map of resource tags. All of these tags must exist in the object&#39;s tag set in order for the rule to apply.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. All of these tags must exist in the object&#39;s tag set in order for the rule to apply.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the time when an object is converted to the IA or archive storage class during a valid life cycle. See `transitions` below.
     * 
     */
    @Import(name="transitions")
    private @Nullable Output<List<BucketLifecycleRuleTransitionArgs>> transitions;

    /**
     * @return Specifies the time when an object is converted to the IA or archive storage class during a valid life cycle. See `transitions` below.
     * 
     */
    public Optional<Output<List<BucketLifecycleRuleTransitionArgs>>> transitions() {
        return Optional.ofNullable(this.transitions);
    }

    private BucketLifecycleRuleArgs() {}

    private BucketLifecycleRuleArgs(BucketLifecycleRuleArgs $) {
        this.abortMultipartUploads = $.abortMultipartUploads;
        this.enabled = $.enabled;
        this.expirations = $.expirations;
        this.filter = $.filter;
        this.id = $.id;
        this.noncurrentVersionExpirations = $.noncurrentVersionExpirations;
        this.noncurrentVersionTransitions = $.noncurrentVersionTransitions;
        this.prefix = $.prefix;
        this.tags = $.tags;
        this.transitions = $.transitions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLifecycleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleRuleArgs $;

        public Builder() {
            $ = new BucketLifecycleRuleArgs();
        }

        public Builder(BucketLifecycleRuleArgs defaults) {
            $ = new BucketLifecycleRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param abortMultipartUploads Specifies the number of days after initiating a multipart upload when the multipart upload must be completed. See `abort_multipart_upload` below.
         * 
         * @return builder
         * 
         */
        public Builder abortMultipartUploads(@Nullable Output<List<BucketLifecycleRuleAbortMultipartUploadArgs>> abortMultipartUploads) {
            $.abortMultipartUploads = abortMultipartUploads;
            return this;
        }

        /**
         * @param abortMultipartUploads Specifies the number of days after initiating a multipart upload when the multipart upload must be completed. See `abort_multipart_upload` below.
         * 
         * @return builder
         * 
         */
        public Builder abortMultipartUploads(List<BucketLifecycleRuleAbortMultipartUploadArgs> abortMultipartUploads) {
            return abortMultipartUploads(Output.of(abortMultipartUploads));
        }

        /**
         * @param abortMultipartUploads Specifies the number of days after initiating a multipart upload when the multipart upload must be completed. See `abort_multipart_upload` below.
         * 
         * @return builder
         * 
         */
        public Builder abortMultipartUploads(BucketLifecycleRuleAbortMultipartUploadArgs... abortMultipartUploads) {
            return abortMultipartUploads(List.of(abortMultipartUploads));
        }

        /**
         * @param enabled Specifies lifecycle rule status.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies lifecycle rule status.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param expirations Specifies a period in the object&#39;s expire. See `expiration` below.
         * 
         * @return builder
         * 
         */
        public Builder expirations(@Nullable Output<List<BucketLifecycleRuleExpirationArgs>> expirations) {
            $.expirations = expirations;
            return this;
        }

        /**
         * @param expirations Specifies a period in the object&#39;s expire. See `expiration` below.
         * 
         * @return builder
         * 
         */
        public Builder expirations(List<BucketLifecycleRuleExpirationArgs> expirations) {
            return expirations(Output.of(expirations));
        }

        /**
         * @param expirations Specifies a period in the object&#39;s expire. See `expiration` below.
         * 
         * @return builder
         * 
         */
        public Builder expirations(BucketLifecycleRuleExpirationArgs... expirations) {
            return expirations(List.of(expirations));
        }

        /**
         * @param filter Configuration block used to identify objects that a Lifecycle rule applies to. See `filter` below.
         * 
         * `NOTE`: At least one of expiration, transitions, abort_multipart_upload, noncurrent_version_expiration and noncurrent_version_transition should be configured.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<BucketLifecycleRuleFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Configuration block used to identify objects that a Lifecycle rule applies to. See `filter` below.
         * 
         * `NOTE`: At least one of expiration, transitions, abort_multipart_upload, noncurrent_version_expiration and noncurrent_version_transition should be configured.
         * 
         * @return builder
         * 
         */
        public Builder filter(BucketLifecycleRuleFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param id Unique identifier for the rule. If omitted, OSS bucket will assign a unique name.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique identifier for the rule. If omitted, OSS bucket will assign a unique name.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param noncurrentVersionExpirations Specifies when noncurrent object versions expire. See `noncurrent_version_expiration` below.
         * 
         * @return builder
         * 
         */
        public Builder noncurrentVersionExpirations(@Nullable Output<List<BucketLifecycleRuleNoncurrentVersionExpirationArgs>> noncurrentVersionExpirations) {
            $.noncurrentVersionExpirations = noncurrentVersionExpirations;
            return this;
        }

        /**
         * @param noncurrentVersionExpirations Specifies when noncurrent object versions expire. See `noncurrent_version_expiration` below.
         * 
         * @return builder
         * 
         */
        public Builder noncurrentVersionExpirations(List<BucketLifecycleRuleNoncurrentVersionExpirationArgs> noncurrentVersionExpirations) {
            return noncurrentVersionExpirations(Output.of(noncurrentVersionExpirations));
        }

        /**
         * @param noncurrentVersionExpirations Specifies when noncurrent object versions expire. See `noncurrent_version_expiration` below.
         * 
         * @return builder
         * 
         */
        public Builder noncurrentVersionExpirations(BucketLifecycleRuleNoncurrentVersionExpirationArgs... noncurrentVersionExpirations) {
            return noncurrentVersionExpirations(List.of(noncurrentVersionExpirations));
        }

        /**
         * @param noncurrentVersionTransitions Specifies when noncurrent object versions transitions. See `noncurrent_version_transition` below.
         * 
         * @return builder
         * 
         */
        public Builder noncurrentVersionTransitions(@Nullable Output<List<BucketLifecycleRuleNoncurrentVersionTransitionArgs>> noncurrentVersionTransitions) {
            $.noncurrentVersionTransitions = noncurrentVersionTransitions;
            return this;
        }

        /**
         * @param noncurrentVersionTransitions Specifies when noncurrent object versions transitions. See `noncurrent_version_transition` below.
         * 
         * @return builder
         * 
         */
        public Builder noncurrentVersionTransitions(List<BucketLifecycleRuleNoncurrentVersionTransitionArgs> noncurrentVersionTransitions) {
            return noncurrentVersionTransitions(Output.of(noncurrentVersionTransitions));
        }

        /**
         * @param noncurrentVersionTransitions Specifies when noncurrent object versions transitions. See `noncurrent_version_transition` below.
         * 
         * @return builder
         * 
         */
        public Builder noncurrentVersionTransitions(BucketLifecycleRuleNoncurrentVersionTransitionArgs... noncurrentVersionTransitions) {
            return noncurrentVersionTransitions(List.of(noncurrentVersionTransitions));
        }

        /**
         * @param prefix The prefix in the names of the objects to which the lifecycle rule does not apply.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix The prefix in the names of the objects to which the lifecycle rule does not apply.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param tags Key-value map of resource tags. All of these tags must exist in the object&#39;s tag set in order for the rule to apply.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. All of these tags must exist in the object&#39;s tag set in order for the rule to apply.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param transitions Specifies the time when an object is converted to the IA or archive storage class during a valid life cycle. See `transitions` below.
         * 
         * @return builder
         * 
         */
        public Builder transitions(@Nullable Output<List<BucketLifecycleRuleTransitionArgs>> transitions) {
            $.transitions = transitions;
            return this;
        }

        /**
         * @param transitions Specifies the time when an object is converted to the IA or archive storage class during a valid life cycle. See `transitions` below.
         * 
         * @return builder
         * 
         */
        public Builder transitions(List<BucketLifecycleRuleTransitionArgs> transitions) {
            return transitions(Output.of(transitions));
        }

        /**
         * @param transitions Specifies the time when an object is converted to the IA or archive storage class during a valid life cycle. See `transitions` below.
         * 
         * @return builder
         * 
         */
        public Builder transitions(BucketLifecycleRuleTransitionArgs... transitions) {
            return transitions(List.of(transitions));
        }

        public BucketLifecycleRuleArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("BucketLifecycleRuleArgs", "enabled");
            }
            return $;
        }
    }

}
