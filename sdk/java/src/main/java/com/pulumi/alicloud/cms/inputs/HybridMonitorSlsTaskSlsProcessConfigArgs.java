// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.alicloud.cms.inputs.HybridMonitorSlsTaskSlsProcessConfigExpressArgs;
import com.pulumi.alicloud.cms.inputs.HybridMonitorSlsTaskSlsProcessConfigFilterArgs;
import com.pulumi.alicloud.cms.inputs.HybridMonitorSlsTaskSlsProcessConfigGroupByArgs;
import com.pulumi.alicloud.cms.inputs.HybridMonitorSlsTaskSlsProcessConfigStatisticArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HybridMonitorSlsTaskSlsProcessConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final HybridMonitorSlsTaskSlsProcessConfigArgs Empty = new HybridMonitorSlsTaskSlsProcessConfigArgs();

    /**
     * The extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    @Import(name="expresses")
    private @Nullable Output<List<HybridMonitorSlsTaskSlsProcessConfigExpressArgs>> expresses;

    /**
     * @return The extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    public Optional<Output<List<HybridMonitorSlsTaskSlsProcessConfigExpressArgs>>> expresses() {
        return Optional.ofNullable(this.expresses);
    }

    /**
     * The conditions that are used to filter logs imported from Log Service. See the following `Block filter`.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<HybridMonitorSlsTaskSlsProcessConfigFilterArgs> filter;

    /**
     * @return The conditions that are used to filter logs imported from Log Service. See the following `Block filter`.
     * 
     */
    public Optional<Output<HybridMonitorSlsTaskSlsProcessConfigFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL. See the following `Block group_by`.
     * 
     */
    @Import(name="groupBies")
    private @Nullable Output<List<HybridMonitorSlsTaskSlsProcessConfigGroupByArgs>> groupBies;

    /**
     * @return The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL. See the following `Block group_by`.
     * 
     */
    public Optional<Output<List<HybridMonitorSlsTaskSlsProcessConfigGroupByArgs>>> groupBies() {
        return Optional.ofNullable(this.groupBies);
    }

    /**
     * The method that is used to aggregate logs imported from Log Service. See the following `Block statistics`.
     * 
     */
    @Import(name="statistics")
    private @Nullable Output<List<HybridMonitorSlsTaskSlsProcessConfigStatisticArgs>> statistics;

    /**
     * @return The method that is used to aggregate logs imported from Log Service. See the following `Block statistics`.
     * 
     */
    public Optional<Output<List<HybridMonitorSlsTaskSlsProcessConfigStatisticArgs>>> statistics() {
        return Optional.ofNullable(this.statistics);
    }

    private HybridMonitorSlsTaskSlsProcessConfigArgs() {}

    private HybridMonitorSlsTaskSlsProcessConfigArgs(HybridMonitorSlsTaskSlsProcessConfigArgs $) {
        this.expresses = $.expresses;
        this.filter = $.filter;
        this.groupBies = $.groupBies;
        this.statistics = $.statistics;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HybridMonitorSlsTaskSlsProcessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HybridMonitorSlsTaskSlsProcessConfigArgs $;

        public Builder() {
            $ = new HybridMonitorSlsTaskSlsProcessConfigArgs();
        }

        public Builder(HybridMonitorSlsTaskSlsProcessConfigArgs defaults) {
            $ = new HybridMonitorSlsTaskSlsProcessConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expresses The extended field that specifies the result of basic operations that are performed on aggregation results.
         * 
         * @return builder
         * 
         */
        public Builder expresses(@Nullable Output<List<HybridMonitorSlsTaskSlsProcessConfigExpressArgs>> expresses) {
            $.expresses = expresses;
            return this;
        }

        /**
         * @param expresses The extended field that specifies the result of basic operations that are performed on aggregation results.
         * 
         * @return builder
         * 
         */
        public Builder expresses(List<HybridMonitorSlsTaskSlsProcessConfigExpressArgs> expresses) {
            return expresses(Output.of(expresses));
        }

        /**
         * @param expresses The extended field that specifies the result of basic operations that are performed on aggregation results.
         * 
         * @return builder
         * 
         */
        public Builder expresses(HybridMonitorSlsTaskSlsProcessConfigExpressArgs... expresses) {
            return expresses(List.of(expresses));
        }

        /**
         * @param filter The conditions that are used to filter logs imported from Log Service. See the following `Block filter`.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<HybridMonitorSlsTaskSlsProcessConfigFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter The conditions that are used to filter logs imported from Log Service. See the following `Block filter`.
         * 
         * @return builder
         * 
         */
        public Builder filter(HybridMonitorSlsTaskSlsProcessConfigFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param groupBies The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL. See the following `Block group_by`.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(@Nullable Output<List<HybridMonitorSlsTaskSlsProcessConfigGroupByArgs>> groupBies) {
            $.groupBies = groupBies;
            return this;
        }

        /**
         * @param groupBies The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL. See the following `Block group_by`.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(List<HybridMonitorSlsTaskSlsProcessConfigGroupByArgs> groupBies) {
            return groupBies(Output.of(groupBies));
        }

        /**
         * @param groupBies The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL. See the following `Block group_by`.
         * 
         * @return builder
         * 
         */
        public Builder groupBies(HybridMonitorSlsTaskSlsProcessConfigGroupByArgs... groupBies) {
            return groupBies(List.of(groupBies));
        }

        /**
         * @param statistics The method that is used to aggregate logs imported from Log Service. See the following `Block statistics`.
         * 
         * @return builder
         * 
         */
        public Builder statistics(@Nullable Output<List<HybridMonitorSlsTaskSlsProcessConfigStatisticArgs>> statistics) {
            $.statistics = statistics;
            return this;
        }

        /**
         * @param statistics The method that is used to aggregate logs imported from Log Service. See the following `Block statistics`.
         * 
         * @return builder
         * 
         */
        public Builder statistics(List<HybridMonitorSlsTaskSlsProcessConfigStatisticArgs> statistics) {
            return statistics(Output.of(statistics));
        }

        /**
         * @param statistics The method that is used to aggregate logs imported from Log Service. See the following `Block statistics`.
         * 
         * @return builder
         * 
         */
        public Builder statistics(HybridMonitorSlsTaskSlsProcessConfigStatisticArgs... statistics) {
            return statistics(List.of(statistics));
        }

        public HybridMonitorSlsTaskSlsProcessConfigArgs build() {
            return $;
        }
    }

}