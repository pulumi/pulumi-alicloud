// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticTaskAvailableAssertionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticTaskAvailableAssertionArgs Empty = new SyntheticTaskAvailableAssertionArgs();

    /**
     * Expected value.
     * 
     */
    @Import(name="expect", required=true)
    private Output<String> expect;

    /**
     * @return Expected value.
     * 
     */
    public Output<String> expect() {
        return this.expect;
    }

    /**
     * Condition: gt: greater than; gte: greater than or equal to; lt: less than; te: less than or equal to; eq: equal to; neq: not equal to; ctn: contains; nctn: does not contain; exist: exists; n_exist: does not exist; belong: belongs to; reg_match: regular matching.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return Condition: gt: greater than; gte: greater than or equal to; lt: less than; te: less than or equal to; eq: equal to; neq: not equal to; ctn: contains; nctn: does not contain; exist: exists; n_exist: does not exist; belong: belongs to; reg_match: regular matching.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * Check the target. If the target is HttpResCode, HttpResBody, or httpressetime, you do not need to specify the target. If the target is HttpResHead, you need to specify the key in the header. If the target is HttpResHead, you need to use jsonPath.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return Check the target. If the target is HttpResCode, HttpResBody, or httpressetime, you do not need to specify the target. If the target is HttpResHead, you need to specify the key in the header. If the target is HttpResHead, you need to use jsonPath.
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * Assertion type, including: httpresead, httpresead, HttpResBody, HttpResBodyJson, httpressetime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet delay ms), icmppackwebscreen, fmppackavglatency (average delay rendering), TraceRouteHops (number of hops), dnsarecname, websiteOnload (full load time), see the supplement below for specific use.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Assertion type, including: httpresead, httpresead, HttpResBody, HttpResBodyJson, httpressetime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet delay ms), icmppackwebscreen, fmppackavglatency (average delay rendering), TraceRouteHops (number of hops), dnsarecname, websiteOnload (full load time), see the supplement below for specific use.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private SyntheticTaskAvailableAssertionArgs() {}

    private SyntheticTaskAvailableAssertionArgs(SyntheticTaskAvailableAssertionArgs $) {
        this.expect = $.expect;
        this.operator = $.operator;
        this.target = $.target;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticTaskAvailableAssertionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticTaskAvailableAssertionArgs $;

        public Builder() {
            $ = new SyntheticTaskAvailableAssertionArgs();
        }

        public Builder(SyntheticTaskAvailableAssertionArgs defaults) {
            $ = new SyntheticTaskAvailableAssertionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expect Expected value.
         * 
         * @return builder
         * 
         */
        public Builder expect(Output<String> expect) {
            $.expect = expect;
            return this;
        }

        /**
         * @param expect Expected value.
         * 
         * @return builder
         * 
         */
        public Builder expect(String expect) {
            return expect(Output.of(expect));
        }

        /**
         * @param operator Condition: gt: greater than; gte: greater than or equal to; lt: less than; te: less than or equal to; eq: equal to; neq: not equal to; ctn: contains; nctn: does not contain; exist: exists; n_exist: does not exist; belong: belongs to; reg_match: regular matching.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator Condition: gt: greater than; gte: greater than or equal to; lt: less than; te: less than or equal to; eq: equal to; neq: not equal to; ctn: contains; nctn: does not contain; exist: exists; n_exist: does not exist; belong: belongs to; reg_match: regular matching.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param target Check the target. If the target is HttpResCode, HttpResBody, or httpressetime, you do not need to specify the target. If the target is HttpResHead, you need to specify the key in the header. If the target is HttpResHead, you need to use jsonPath.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Check the target. If the target is HttpResCode, HttpResBody, or httpressetime, you do not need to specify the target. If the target is HttpResHead, you need to specify the key in the header. If the target is HttpResHead, you need to use jsonPath.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param type Assertion type, including: httpresead, httpresead, HttpResBody, HttpResBodyJson, httpressetime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet delay ms), icmppackwebscreen, fmppackavglatency (average delay rendering), TraceRouteHops (number of hops), dnsarecname, websiteOnload (full load time), see the supplement below for specific use.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Assertion type, including: httpresead, httpresead, HttpResBody, HttpResBodyJson, httpressetime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet delay ms), icmppackwebscreen, fmppackavglatency (average delay rendering), TraceRouteHops (number of hops), dnsarecname, websiteOnload (full load time), see the supplement below for specific use.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SyntheticTaskAvailableAssertionArgs build() {
            if ($.expect == null) {
                throw new MissingRequiredPropertyException("SyntheticTaskAvailableAssertionArgs", "expect");
            }
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("SyntheticTaskAvailableAssertionArgs", "operator");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("SyntheticTaskAvailableAssertionArgs", "type");
            }
            return $;
        }
    }

}