// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.directmail.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReceiversPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReceiversPlainArgs Empty = new GetReceiversPlainArgs();

    /**
     * A list of Receivers IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Receivers IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The key word.
     * 
     */
    @Import(name="keyWord")
    private @Nullable String keyWord;

    /**
     * @return The key word.
     * 
     */
    public Optional<String> keyWord() {
        return Optional.ofNullable(this.keyWord);
    }

    /**
     * A regex string to filter results by Receivers name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Receivers name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of the resource.
     * 
     */
    @Import(name="status")
    private @Nullable Integer status;

    /**
     * @return The status of the resource.
     * 
     */
    public Optional<Integer> status() {
        return Optional.ofNullable(this.status);
    }

    private GetReceiversPlainArgs() {}

    private GetReceiversPlainArgs(GetReceiversPlainArgs $) {
        this.ids = $.ids;
        this.keyWord = $.keyWord;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReceiversPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReceiversPlainArgs $;

        public Builder() {
            $ = new GetReceiversPlainArgs();
        }

        public Builder(GetReceiversPlainArgs defaults) {
            $ = new GetReceiversPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Receivers IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Receivers IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param keyWord The key word.
         * 
         * @return builder
         * 
         */
        public Builder keyWord(@Nullable String keyWord) {
            $.keyWord = keyWord;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Receivers name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Integer status) {
            $.status = status;
            return this;
        }

        public GetReceiversPlainArgs build() {
            return $;
        }
    }

}