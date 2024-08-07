// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWafRulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWafRulesPlainArgs Empty = new GetWafRulesPlainArgs();

    /**
     * A list of Waf Rule IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Waf Rule IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    @Import(name="pageNumber")
    private @Nullable Integer pageNumber;

    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Integer pageSize;

    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * The query conditions. The value is a string in the JSON format.
     * 
     */
    @Import(name="queryArgs")
    private @Nullable String queryArgs;

    /**
     * @return The query conditions. The value is a string in the JSON format.
     * 
     */
    public Optional<String> queryArgs() {
        return Optional.ofNullable(this.queryArgs);
    }

    private GetWafRulesPlainArgs() {}

    private GetWafRulesPlainArgs(GetWafRulesPlainArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.queryArgs = $.queryArgs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWafRulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWafRulesPlainArgs $;

        public Builder() {
            $ = new GetWafRulesPlainArgs();
        }

        public Builder(GetWafRulesPlainArgs defaults) {
            $ = new GetWafRulesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Waf Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Waf Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder pageNumber(@Nullable Integer pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageSize(@Nullable Integer pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        /**
         * @param queryArgs The query conditions. The value is a string in the JSON format.
         * 
         * @return builder
         * 
         */
        public Builder queryArgs(@Nullable String queryArgs) {
            $.queryArgs = queryArgs;
            return this;
        }

        public GetWafRulesPlainArgs build() {
            return $;
        }
    }

}
