// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.inputs;

import com.pulumi.alicloud.log.inputs.StoreIndexFieldSearchArgs;
import com.pulumi.alicloud.log.inputs.StoreIndexFullTextArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StoreIndexState extends com.pulumi.resources.ResourceArgs {

    public static final StoreIndexState Empty = new StoreIndexState();

    /**
     * List configurations of field search index. Valid item as follows:
     * 
     */
    @Import(name="fieldSearches")
    private @Nullable Output<List<StoreIndexFieldSearchArgs>> fieldSearches;

    /**
     * @return List configurations of field search index. Valid item as follows:
     * 
     */
    public Optional<Output<List<StoreIndexFieldSearchArgs>>> fieldSearches() {
        return Optional.ofNullable(this.fieldSearches);
    }

    /**
     * The configuration of full text index. Valid item as follows:
     * 
     */
    @Import(name="fullText")
    private @Nullable Output<StoreIndexFullTextArgs> fullText;

    /**
     * @return The configuration of full text index. Valid item as follows:
     * 
     */
    public Optional<Output<StoreIndexFullTextArgs>> fullText() {
        return Optional.ofNullable(this.fullText);
    }

    /**
     * The log store name to the query index belongs.
     * 
     */
    @Import(name="logstore")
    private @Nullable Output<String> logstore;

    /**
     * @return The log store name to the query index belongs.
     * 
     */
    public Optional<Output<String>> logstore() {
        return Optional.ofNullable(this.logstore);
    }

    /**
     * The project name to the log store belongs.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project name to the log store belongs.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private StoreIndexState() {}

    private StoreIndexState(StoreIndexState $) {
        this.fieldSearches = $.fieldSearches;
        this.fullText = $.fullText;
        this.logstore = $.logstore;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StoreIndexState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StoreIndexState $;

        public Builder() {
            $ = new StoreIndexState();
        }

        public Builder(StoreIndexState defaults) {
            $ = new StoreIndexState(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldSearches List configurations of field search index. Valid item as follows:
         * 
         * @return builder
         * 
         */
        public Builder fieldSearches(@Nullable Output<List<StoreIndexFieldSearchArgs>> fieldSearches) {
            $.fieldSearches = fieldSearches;
            return this;
        }

        /**
         * @param fieldSearches List configurations of field search index. Valid item as follows:
         * 
         * @return builder
         * 
         */
        public Builder fieldSearches(List<StoreIndexFieldSearchArgs> fieldSearches) {
            return fieldSearches(Output.of(fieldSearches));
        }

        /**
         * @param fieldSearches List configurations of field search index. Valid item as follows:
         * 
         * @return builder
         * 
         */
        public Builder fieldSearches(StoreIndexFieldSearchArgs... fieldSearches) {
            return fieldSearches(List.of(fieldSearches));
        }

        /**
         * @param fullText The configuration of full text index. Valid item as follows:
         * 
         * @return builder
         * 
         */
        public Builder fullText(@Nullable Output<StoreIndexFullTextArgs> fullText) {
            $.fullText = fullText;
            return this;
        }

        /**
         * @param fullText The configuration of full text index. Valid item as follows:
         * 
         * @return builder
         * 
         */
        public Builder fullText(StoreIndexFullTextArgs fullText) {
            return fullText(Output.of(fullText));
        }

        /**
         * @param logstore The log store name to the query index belongs.
         * 
         * @return builder
         * 
         */
        public Builder logstore(@Nullable Output<String> logstore) {
            $.logstore = logstore;
            return this;
        }

        /**
         * @param logstore The log store name to the query index belongs.
         * 
         * @return builder
         * 
         */
        public Builder logstore(String logstore) {
            return logstore(Output.of(logstore));
        }

        /**
         * @param project The project name to the log store belongs.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project name to the log store belongs.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public StoreIndexState build() {
            return $;
        }
    }

}
