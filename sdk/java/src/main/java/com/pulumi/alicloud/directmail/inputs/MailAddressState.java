// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.directmail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MailAddressState extends com.pulumi.resources.ResourceArgs {

    public static final MailAddressState Empty = new MailAddressState();

    /**
     * The sender address. The email address must be filled in the format of account{@literal @}domain, and only lowercase letters or numbers can be used.
     * 
     */
    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    /**
     * @return The sender address. The email address must be filled in the format of account{@literal @}domain, and only lowercase letters or numbers can be used.
     * 
     */
    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * Account password. The password must be length 10-20 string, contains numbers, uppercase letters, lowercase letters at the same time.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Account password. The password must be length 10-20 string, contains numbers, uppercase letters, lowercase letters at the same time.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Return address.
     * 
     */
    @Import(name="replyAddress")
    private @Nullable Output<String> replyAddress;

    /**
     * @return Return address.
     * 
     */
    public Optional<Output<String>> replyAddress() {
        return Optional.ofNullable(this.replyAddress);
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
     * Account Status freeze: 1, normal: 0.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Account Status freeze: 1, normal: 0.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private MailAddressState() {}

    private MailAddressState(MailAddressState $) {
        this.accountName = $.accountName;
        this.password = $.password;
        this.replyAddress = $.replyAddress;
        this.sendtype = $.sendtype;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MailAddressState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MailAddressState $;

        public Builder() {
            $ = new MailAddressState();
        }

        public Builder(MailAddressState defaults) {
            $ = new MailAddressState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The sender address. The email address must be filled in the format of account{@literal @}domain, and only lowercase letters or numbers can be used.
         * 
         * @return builder
         * 
         */
        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The sender address. The email address must be filled in the format of account{@literal @}domain, and only lowercase letters or numbers can be used.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param password Account password. The password must be length 10-20 string, contains numbers, uppercase letters, lowercase letters at the same time.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Account password. The password must be length 10-20 string, contains numbers, uppercase letters, lowercase letters at the same time.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param replyAddress Return address.
         * 
         * @return builder
         * 
         */
        public Builder replyAddress(@Nullable Output<String> replyAddress) {
            $.replyAddress = replyAddress;
            return this;
        }

        /**
         * @param replyAddress Return address.
         * 
         * @return builder
         * 
         */
        public Builder replyAddress(String replyAddress) {
            return replyAddress(Output.of(replyAddress));
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
         * @param status Account Status freeze: 1, normal: 0.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Account Status freeze: 1, normal: 0.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public MailAddressState build() {
            return $;
        }
    }

}