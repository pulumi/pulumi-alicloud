// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDispatchRulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDispatchRulesPlainArgs Empty = new GetDispatchRulesPlainArgs();

    /**
     * The name of the dispatch rule.
     * 
     */
    @Import(name="dispatchRuleName")
    private @Nullable String dispatchRuleName;

    /**
     * @return The name of the dispatch rule.
     * 
     */
    public Optional<String> dispatchRuleName() {
        return Optional.ofNullable(this.dispatchRuleName);
    }

    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of dispatch rule id.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of dispatch rule id.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Dispatch Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Dispatch Rule name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
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

    private GetDispatchRulesPlainArgs() {}

    private GetDispatchRulesPlainArgs(GetDispatchRulesPlainArgs $) {
        this.dispatchRuleName = $.dispatchRuleName;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDispatchRulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDispatchRulesPlainArgs $;

        public Builder() {
            $ = new GetDispatchRulesPlainArgs();
        }

        public Builder(GetDispatchRulesPlainArgs defaults) {
            $ = new GetDispatchRulesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dispatchRuleName The name of the dispatch rule.
         * 
         * @return builder
         * 
         */
        public Builder dispatchRuleName(@Nullable String dispatchRuleName) {
            $.dispatchRuleName = dispatchRuleName;
            return this;
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of dispatch rule id.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of dispatch rule id.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Dispatch Rule name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
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

        public GetDispatchRulesPlainArgs build() {
            return $;
        }
    }

}
