// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa;

import com.pulumi.alicloud.esa.inputs.RecordAuthConfArgs;
import com.pulumi.alicloud.esa.inputs.RecordDataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecordArgs Empty = new RecordArgs();

    /**
     * The origin authentication information of the CNAME record. See `auth_conf` below.
     * 
     */
    @Import(name="authConf")
    private @Nullable Output<RecordAuthConfArgs> authConf;

    /**
     * @return The origin authentication information of the CNAME record. See `auth_conf` below.
     * 
     */
    public Optional<Output<RecordAuthConfArgs>> authConf() {
        return Optional.ofNullable(this.authConf);
    }

    /**
     * The business scenario of the record for acceleration. Valid values:
     * 
     */
    @Import(name="bizName")
    private @Nullable Output<String> bizName;

    /**
     * @return The business scenario of the record for acceleration. Valid values:
     * 
     */
    public Optional<Output<String>> bizName() {
        return Optional.ofNullable(this.bizName);
    }

    /**
     * The comments of the record.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return The comments of the record.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The DNS record information. The format of this field varies based on the record type. For more information, see [Add DNS records](https://www.alibabacloud.com/help/doc-detail/2708761.html). See `data` below.
     * 
     */
    @Import(name="data", required=true)
    private Output<RecordDataArgs> data;

    /**
     * @return The DNS record information. The format of this field varies based on the record type. For more information, see [Add DNS records](https://www.alibabacloud.com/help/doc-detail/2708761.html). See `data` below.
     * 
     */
    public Output<RecordDataArgs> data() {
        return this.data;
    }

    /**
     * The origin host policy. This policy takes effect when the record type is CNAME. You can set the policy in two modes:
     * 
     */
    @Import(name="hostPolicy")
    private @Nullable Output<String> hostPolicy;

    /**
     * @return The origin host policy. This policy takes effect when the record type is CNAME. You can set the policy in two modes:
     * 
     */
    public Optional<Output<String>> hostPolicy() {
        return Optional.ofNullable(this.hostPolicy);
    }

    /**
     * Filters by whether the record is proxied. Valid values:
     * 
     */
    @Import(name="proxied")
    private @Nullable Output<Boolean> proxied;

    /**
     * @return Filters by whether the record is proxied. Valid values:
     * 
     */
    public Optional<Output<Boolean>> proxied() {
        return Optional.ofNullable(this.proxied);
    }

    /**
     * The record name. This parameter specifies a filter condition for the query.
     * 
     */
    @Import(name="recordName", required=true)
    private Output<String> recordName;

    /**
     * @return The record name. This parameter specifies a filter condition for the query.
     * 
     */
    public Output<String> recordName() {
        return this.recordName;
    }

    /**
     * The DNS record type.
     * 
     */
    @Import(name="recordType", required=true)
    private Output<String> recordType;

    /**
     * @return The DNS record type.
     * 
     */
    public Output<String> recordType() {
        return this.recordType;
    }

    /**
     * The website ID, which can be obtained by calling the [ListSites](https://www.alibabacloud.com/help/en/doc-detail/2850189.html) operation.
     * 
     */
    @Import(name="siteId", required=true)
    private Output<Integer> siteId;

    /**
     * @return The website ID, which can be obtained by calling the [ListSites](https://www.alibabacloud.com/help/en/doc-detail/2850189.html) operation.
     * 
     */
    public Output<Integer> siteId() {
        return this.siteId;
    }

    /**
     * The origin type of the record. Only CNAME records can be filtered by using this field. Valid values:
     * 
     * - `OSS`: OSS bucket.
     * - `S3`: S3 bucket.
     * - `LB`: load balancer.
     * - `OP`: origin pool.
     * - `Domain`: domain name.
     * 
     */
    @Import(name="sourceType")
    private @Nullable Output<String> sourceType;

    /**
     * @return The origin type of the record. Only CNAME records can be filtered by using this field. Valid values:
     * 
     * - `OSS`: OSS bucket.
     * - `S3`: S3 bucket.
     * - `LB`: load balancer.
     * - `OP`: origin pool.
     * - `Domain`: domain name.
     * 
     */
    public Optional<Output<String>> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    /**
     * The TTL of the record. Unit: seconds. The range is 30 to 86,400, or 1. If the value is 1, the TTL of the record is determined by the system.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return The TTL of the record. Unit: seconds. The range is 30 to 86,400, or 1. If the value is 1, the TTL of the record is determined by the system.
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    private RecordArgs() {}

    private RecordArgs(RecordArgs $) {
        this.authConf = $.authConf;
        this.bizName = $.bizName;
        this.comment = $.comment;
        this.data = $.data;
        this.hostPolicy = $.hostPolicy;
        this.proxied = $.proxied;
        this.recordName = $.recordName;
        this.recordType = $.recordType;
        this.siteId = $.siteId;
        this.sourceType = $.sourceType;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordArgs $;

        public Builder() {
            $ = new RecordArgs();
        }

        public Builder(RecordArgs defaults) {
            $ = new RecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authConf The origin authentication information of the CNAME record. See `auth_conf` below.
         * 
         * @return builder
         * 
         */
        public Builder authConf(@Nullable Output<RecordAuthConfArgs> authConf) {
            $.authConf = authConf;
            return this;
        }

        /**
         * @param authConf The origin authentication information of the CNAME record. See `auth_conf` below.
         * 
         * @return builder
         * 
         */
        public Builder authConf(RecordAuthConfArgs authConf) {
            return authConf(Output.of(authConf));
        }

        /**
         * @param bizName The business scenario of the record for acceleration. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder bizName(@Nullable Output<String> bizName) {
            $.bizName = bizName;
            return this;
        }

        /**
         * @param bizName The business scenario of the record for acceleration. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder bizName(String bizName) {
            return bizName(Output.of(bizName));
        }

        /**
         * @param comment The comments of the record.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment The comments of the record.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param data The DNS record information. The format of this field varies based on the record type. For more information, see [Add DNS records](https://www.alibabacloud.com/help/doc-detail/2708761.html). See `data` below.
         * 
         * @return builder
         * 
         */
        public Builder data(Output<RecordDataArgs> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data The DNS record information. The format of this field varies based on the record type. For more information, see [Add DNS records](https://www.alibabacloud.com/help/doc-detail/2708761.html). See `data` below.
         * 
         * @return builder
         * 
         */
        public Builder data(RecordDataArgs data) {
            return data(Output.of(data));
        }

        /**
         * @param hostPolicy The origin host policy. This policy takes effect when the record type is CNAME. You can set the policy in two modes:
         * 
         * @return builder
         * 
         */
        public Builder hostPolicy(@Nullable Output<String> hostPolicy) {
            $.hostPolicy = hostPolicy;
            return this;
        }

        /**
         * @param hostPolicy The origin host policy. This policy takes effect when the record type is CNAME. You can set the policy in two modes:
         * 
         * @return builder
         * 
         */
        public Builder hostPolicy(String hostPolicy) {
            return hostPolicy(Output.of(hostPolicy));
        }

        /**
         * @param proxied Filters by whether the record is proxied. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder proxied(@Nullable Output<Boolean> proxied) {
            $.proxied = proxied;
            return this;
        }

        /**
         * @param proxied Filters by whether the record is proxied. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder proxied(Boolean proxied) {
            return proxied(Output.of(proxied));
        }

        /**
         * @param recordName The record name. This parameter specifies a filter condition for the query.
         * 
         * @return builder
         * 
         */
        public Builder recordName(Output<String> recordName) {
            $.recordName = recordName;
            return this;
        }

        /**
         * @param recordName The record name. This parameter specifies a filter condition for the query.
         * 
         * @return builder
         * 
         */
        public Builder recordName(String recordName) {
            return recordName(Output.of(recordName));
        }

        /**
         * @param recordType The DNS record type.
         * 
         * @return builder
         * 
         */
        public Builder recordType(Output<String> recordType) {
            $.recordType = recordType;
            return this;
        }

        /**
         * @param recordType The DNS record type.
         * 
         * @return builder
         * 
         */
        public Builder recordType(String recordType) {
            return recordType(Output.of(recordType));
        }

        /**
         * @param siteId The website ID, which can be obtained by calling the [ListSites](https://www.alibabacloud.com/help/en/doc-detail/2850189.html) operation.
         * 
         * @return builder
         * 
         */
        public Builder siteId(Output<Integer> siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteId The website ID, which can be obtained by calling the [ListSites](https://www.alibabacloud.com/help/en/doc-detail/2850189.html) operation.
         * 
         * @return builder
         * 
         */
        public Builder siteId(Integer siteId) {
            return siteId(Output.of(siteId));
        }

        /**
         * @param sourceType The origin type of the record. Only CNAME records can be filtered by using this field. Valid values:
         * 
         * - `OSS`: OSS bucket.
         * - `S3`: S3 bucket.
         * - `LB`: load balancer.
         * - `OP`: origin pool.
         * - `Domain`: domain name.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(@Nullable Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        /**
         * @param sourceType The origin type of the record. Only CNAME records can be filtered by using this field. Valid values:
         * 
         * - `OSS`: OSS bucket.
         * - `S3`: S3 bucket.
         * - `LB`: load balancer.
         * - `OP`: origin pool.
         * - `Domain`: domain name.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        /**
         * @param ttl The TTL of the record. Unit: seconds. The range is 30 to 86,400, or 1. If the value is 1, the TTL of the record is determined by the system.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl The TTL of the record. Unit: seconds. The range is 30 to 86,400, or 1. If the value is 1, the TTL of the record is determined by the system.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        public RecordArgs build() {
            if ($.data == null) {
                throw new MissingRequiredPropertyException("RecordArgs", "data");
            }
            if ($.recordName == null) {
                throw new MissingRequiredPropertyException("RecordArgs", "recordName");
            }
            if ($.recordType == null) {
                throw new MissingRequiredPropertyException("RecordArgs", "recordType");
            }
            if ($.siteId == null) {
                throw new MissingRequiredPropertyException("RecordArgs", "siteId");
            }
            return $;
        }
    }

}
