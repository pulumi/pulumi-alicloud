// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.directmail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMailAddressesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMailAddressesArgs Empty = new GetMailAddressesArgs();

    /**
     * A list of Mail Address IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Mail Address IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The key word about account email address.
     * 
     */
    @Import(name="keyWord")
    private @Nullable Output<String> keyWord;

    /**
     * @return The key word about account email address.
     * 
     */
    public Optional<Output<String>> keyWord() {
        return Optional.ofNullable(this.keyWord);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Account type. Valid values: `batch`, `trigger`.
     * 
     */
    @Import(name="sendtype")
    private @Nullable Output<String> sendtype;

    /**
     * @return Account type. Valid values: `batch`, `trigger`.
     * 
     */
    public Optional<Output<String>> sendtype() {
        return Optional.ofNullable(this.sendtype);
    }

    /**
     * Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetMailAddressesArgs() {}

    private GetMailAddressesArgs(GetMailAddressesArgs $) {
        this.ids = $.ids;
        this.keyWord = $.keyWord;
        this.outputFile = $.outputFile;
        this.sendtype = $.sendtype;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMailAddressesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMailAddressesArgs $;

        public Builder() {
            $ = new GetMailAddressesArgs();
        }

        public Builder(GetMailAddressesArgs defaults) {
            $ = new GetMailAddressesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Mail Address IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Mail Address IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Mail Address IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param keyWord The key word about account email address.
         * 
         * @return builder
         * 
         */
        public Builder keyWord(@Nullable Output<String> keyWord) {
            $.keyWord = keyWord;
            return this;
        }

        /**
         * @param keyWord The key word about account email address.
         * 
         * @return builder
         * 
         */
        public Builder keyWord(String keyWord) {
            return keyWord(Output.of(keyWord));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param sendtype Account type. Valid values: `batch`, `trigger`.
         * 
         * @return builder
         * 
         */
        public Builder sendtype(@Nullable Output<String> sendtype) {
            $.sendtype = sendtype;
            return this;
        }

        /**
         * @param sendtype Account type. Valid values: `batch`, `trigger`.
         * 
         * @return builder
         * 
         */
        public Builder sendtype(String sendtype) {
            return sendtype(Output.of(sendtype));
        }

        /**
         * @param status Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetMailAddressesArgs build() {
            return $;
        }
    }

}