// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BgpPolicyContentPortRuleListArgs extends com.pulumi.resources.ResourceArgs {

    public static final BgpPolicyContentPortRuleListArgs Empty = new BgpPolicyContentPortRuleListArgs();

    /**
     * End of destination port 0-65535.
     * 
     */
    @Import(name="dstPortEnd", required=true)
    private Output<Integer> dstPortEnd;

    /**
     * @return End of destination port 0-65535.
     * 
     */
    public Output<Integer> dstPortEnd() {
        return this.dstPortEnd;
    }

    /**
     * Destination Port start 0-65535.
     * 
     */
    @Import(name="dstPortStart", required=true)
    private Output<Integer> dstPortStart;

    /**
     * @return Destination Port start 0-65535.
     * 
     */
    public Output<Integer> dstPortStart() {
        return this.dstPortStart;
    }

    /**
     * Action. Currently, only drop is supported.
     * 
     */
    @Import(name="matchAction", required=true)
    private Output<String> matchAction;

    /**
     * @return Action. Currently, only drop is supported.
     * 
     */
    public Output<String> matchAction() {
        return this.matchAction;
    }

    /**
     * Rule UUID is required to be deleted and modified, and is not required to be created.
     * 
     */
    @Import(name="portRuleId")
    private @Nullable Output<String> portRuleId;

    /**
     * @return Rule UUID is required to be deleted and modified, and is not required to be created.
     * 
     */
    public Optional<Output<String>> portRuleId() {
        return Optional.ofNullable(this.portRuleId);
    }

    /**
     * Protocol, tcp or udp.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return Protocol, tcp or udp.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * Serial number 1-100 ● Affects the order issued by the bottom layer ● The larger the number, the lower it is.
     * 
     */
    @Import(name="seqNo", required=true)
    private Output<Integer> seqNo;

    /**
     * @return Serial number 1-100 ● Affects the order issued by the bottom layer ● The larger the number, the lower it is.
     * 
     */
    public Output<Integer> seqNo() {
        return this.seqNo;
    }

    /**
     * Source Port end 0-65535.
     * 
     */
    @Import(name="srcPortEnd", required=true)
    private Output<Integer> srcPortEnd;

    /**
     * @return Source Port end 0-65535.
     * 
     */
    public Output<Integer> srcPortEnd() {
        return this.srcPortEnd;
    }

    /**
     * Source port start 0-65535.
     * 
     */
    @Import(name="srcPortStart", required=true)
    private Output<Integer> srcPortStart;

    /**
     * @return Source port start 0-65535.
     * 
     */
    public Output<Integer> srcPortStart() {
        return this.srcPortStart;
    }

    private BgpPolicyContentPortRuleListArgs() {}

    private BgpPolicyContentPortRuleListArgs(BgpPolicyContentPortRuleListArgs $) {
        this.dstPortEnd = $.dstPortEnd;
        this.dstPortStart = $.dstPortStart;
        this.matchAction = $.matchAction;
        this.portRuleId = $.portRuleId;
        this.protocol = $.protocol;
        this.seqNo = $.seqNo;
        this.srcPortEnd = $.srcPortEnd;
        this.srcPortStart = $.srcPortStart;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BgpPolicyContentPortRuleListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BgpPolicyContentPortRuleListArgs $;

        public Builder() {
            $ = new BgpPolicyContentPortRuleListArgs();
        }

        public Builder(BgpPolicyContentPortRuleListArgs defaults) {
            $ = new BgpPolicyContentPortRuleListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dstPortEnd End of destination port 0-65535.
         * 
         * @return builder
         * 
         */
        public Builder dstPortEnd(Output<Integer> dstPortEnd) {
            $.dstPortEnd = dstPortEnd;
            return this;
        }

        /**
         * @param dstPortEnd End of destination port 0-65535.
         * 
         * @return builder
         * 
         */
        public Builder dstPortEnd(Integer dstPortEnd) {
            return dstPortEnd(Output.of(dstPortEnd));
        }

        /**
         * @param dstPortStart Destination Port start 0-65535.
         * 
         * @return builder
         * 
         */
        public Builder dstPortStart(Output<Integer> dstPortStart) {
            $.dstPortStart = dstPortStart;
            return this;
        }

        /**
         * @param dstPortStart Destination Port start 0-65535.
         * 
         * @return builder
         * 
         */
        public Builder dstPortStart(Integer dstPortStart) {
            return dstPortStart(Output.of(dstPortStart));
        }

        /**
         * @param matchAction Action. Currently, only drop is supported.
         * 
         * @return builder
         * 
         */
        public Builder matchAction(Output<String> matchAction) {
            $.matchAction = matchAction;
            return this;
        }

        /**
         * @param matchAction Action. Currently, only drop is supported.
         * 
         * @return builder
         * 
         */
        public Builder matchAction(String matchAction) {
            return matchAction(Output.of(matchAction));
        }

        /**
         * @param portRuleId Rule UUID is required to be deleted and modified, and is not required to be created.
         * 
         * @return builder
         * 
         */
        public Builder portRuleId(@Nullable Output<String> portRuleId) {
            $.portRuleId = portRuleId;
            return this;
        }

        /**
         * @param portRuleId Rule UUID is required to be deleted and modified, and is not required to be created.
         * 
         * @return builder
         * 
         */
        public Builder portRuleId(String portRuleId) {
            return portRuleId(Output.of(portRuleId));
        }

        /**
         * @param protocol Protocol, tcp or udp.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Protocol, tcp or udp.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param seqNo Serial number 1-100 ● Affects the order issued by the bottom layer ● The larger the number, the lower it is.
         * 
         * @return builder
         * 
         */
        public Builder seqNo(Output<Integer> seqNo) {
            $.seqNo = seqNo;
            return this;
        }

        /**
         * @param seqNo Serial number 1-100 ● Affects the order issued by the bottom layer ● The larger the number, the lower it is.
         * 
         * @return builder
         * 
         */
        public Builder seqNo(Integer seqNo) {
            return seqNo(Output.of(seqNo));
        }

        /**
         * @param srcPortEnd Source Port end 0-65535.
         * 
         * @return builder
         * 
         */
        public Builder srcPortEnd(Output<Integer> srcPortEnd) {
            $.srcPortEnd = srcPortEnd;
            return this;
        }

        /**
         * @param srcPortEnd Source Port end 0-65535.
         * 
         * @return builder
         * 
         */
        public Builder srcPortEnd(Integer srcPortEnd) {
            return srcPortEnd(Output.of(srcPortEnd));
        }

        /**
         * @param srcPortStart Source port start 0-65535.
         * 
         * @return builder
         * 
         */
        public Builder srcPortStart(Output<Integer> srcPortStart) {
            $.srcPortStart = srcPortStart;
            return this;
        }

        /**
         * @param srcPortStart Source port start 0-65535.
         * 
         * @return builder
         * 
         */
        public Builder srcPortStart(Integer srcPortStart) {
            return srcPortStart(Output.of(srcPortStart));
        }

        public BgpPolicyContentPortRuleListArgs build() {
            if ($.dstPortEnd == null) {
                throw new MissingRequiredPropertyException("BgpPolicyContentPortRuleListArgs", "dstPortEnd");
            }
            if ($.dstPortStart == null) {
                throw new MissingRequiredPropertyException("BgpPolicyContentPortRuleListArgs", "dstPortStart");
            }
            if ($.matchAction == null) {
                throw new MissingRequiredPropertyException("BgpPolicyContentPortRuleListArgs", "matchAction");
            }
            if ($.protocol == null) {
                throw new MissingRequiredPropertyException("BgpPolicyContentPortRuleListArgs", "protocol");
            }
            if ($.seqNo == null) {
                throw new MissingRequiredPropertyException("BgpPolicyContentPortRuleListArgs", "seqNo");
            }
            if ($.srcPortEnd == null) {
                throw new MissingRequiredPropertyException("BgpPolicyContentPortRuleListArgs", "srcPortEnd");
            }
            if ($.srcPortStart == null) {
                throw new MissingRequiredPropertyException("BgpPolicyContentPortRuleListArgs", "srcPortStart");
            }
            return $;
        }
    }

}