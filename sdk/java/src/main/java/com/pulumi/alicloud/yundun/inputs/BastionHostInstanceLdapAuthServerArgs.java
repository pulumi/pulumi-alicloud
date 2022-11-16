// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.yundun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BastionHostInstanceLdapAuthServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final BastionHostInstanceLdapAuthServerArgs Empty = new BastionHostInstanceLdapAuthServerArgs();

    @Import(name="account", required=true)
    private Output<String> account;

    public Output<String> account() {
        return this.account;
    }

    @Import(name="baseDn", required=true)
    private Output<String> baseDn;

    public Output<String> baseDn() {
        return this.baseDn;
    }

    @Import(name="emailMapping")
    private @Nullable Output<String> emailMapping;

    public Optional<Output<String>> emailMapping() {
        return Optional.ofNullable(this.emailMapping);
    }

    @Import(name="filter")
    private @Nullable Output<String> filter;

    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    @Import(name="isSsl")
    private @Nullable Output<Boolean> isSsl;

    public Optional<Output<Boolean>> isSsl() {
        return Optional.ofNullable(this.isSsl);
    }

    @Import(name="loginNameMapping")
    private @Nullable Output<String> loginNameMapping;

    public Optional<Output<String>> loginNameMapping() {
        return Optional.ofNullable(this.loginNameMapping);
    }

    @Import(name="mobileMapping")
    private @Nullable Output<String> mobileMapping;

    public Optional<Output<String>> mobileMapping() {
        return Optional.ofNullable(this.mobileMapping);
    }

    @Import(name="nameMapping")
    private @Nullable Output<String> nameMapping;

    public Optional<Output<String>> nameMapping() {
        return Optional.ofNullable(this.nameMapping);
    }

    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    @Import(name="port", required=true)
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    @Import(name="server", required=true)
    private Output<String> server;

    public Output<String> server() {
        return this.server;
    }

    @Import(name="standbyServer")
    private @Nullable Output<String> standbyServer;

    public Optional<Output<String>> standbyServer() {
        return Optional.ofNullable(this.standbyServer);
    }

    private BastionHostInstanceLdapAuthServerArgs() {}

    private BastionHostInstanceLdapAuthServerArgs(BastionHostInstanceLdapAuthServerArgs $) {
        this.account = $.account;
        this.baseDn = $.baseDn;
        this.emailMapping = $.emailMapping;
        this.filter = $.filter;
        this.isSsl = $.isSsl;
        this.loginNameMapping = $.loginNameMapping;
        this.mobileMapping = $.mobileMapping;
        this.nameMapping = $.nameMapping;
        this.password = $.password;
        this.port = $.port;
        this.server = $.server;
        this.standbyServer = $.standbyServer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BastionHostInstanceLdapAuthServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BastionHostInstanceLdapAuthServerArgs $;

        public Builder() {
            $ = new BastionHostInstanceLdapAuthServerArgs();
        }

        public Builder(BastionHostInstanceLdapAuthServerArgs defaults) {
            $ = new BastionHostInstanceLdapAuthServerArgs(Objects.requireNonNull(defaults));
        }

        public Builder account(Output<String> account) {
            $.account = account;
            return this;
        }

        public Builder account(String account) {
            return account(Output.of(account));
        }

        public Builder baseDn(Output<String> baseDn) {
            $.baseDn = baseDn;
            return this;
        }

        public Builder baseDn(String baseDn) {
            return baseDn(Output.of(baseDn));
        }

        public Builder emailMapping(@Nullable Output<String> emailMapping) {
            $.emailMapping = emailMapping;
            return this;
        }

        public Builder emailMapping(String emailMapping) {
            return emailMapping(Output.of(emailMapping));
        }

        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public Builder isSsl(@Nullable Output<Boolean> isSsl) {
            $.isSsl = isSsl;
            return this;
        }

        public Builder isSsl(Boolean isSsl) {
            return isSsl(Output.of(isSsl));
        }

        public Builder loginNameMapping(@Nullable Output<String> loginNameMapping) {
            $.loginNameMapping = loginNameMapping;
            return this;
        }

        public Builder loginNameMapping(String loginNameMapping) {
            return loginNameMapping(Output.of(loginNameMapping));
        }

        public Builder mobileMapping(@Nullable Output<String> mobileMapping) {
            $.mobileMapping = mobileMapping;
            return this;
        }

        public Builder mobileMapping(String mobileMapping) {
            return mobileMapping(Output.of(mobileMapping));
        }

        public Builder nameMapping(@Nullable Output<String> nameMapping) {
            $.nameMapping = nameMapping;
            return this;
        }

        public Builder nameMapping(String nameMapping) {
            return nameMapping(Output.of(nameMapping));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder server(Output<String> server) {
            $.server = server;
            return this;
        }

        public Builder server(String server) {
            return server(Output.of(server));
        }

        public Builder standbyServer(@Nullable Output<String> standbyServer) {
            $.standbyServer = standbyServer;
            return this;
        }

        public Builder standbyServer(String standbyServer) {
            return standbyServer(Output.of(standbyServer));
        }

        public BastionHostInstanceLdapAuthServerArgs build() {
            $.account = Objects.requireNonNull($.account, "expected parameter 'account' to be non-null");
            $.baseDn = Objects.requireNonNull($.baseDn, "expected parameter 'baseDn' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.server = Objects.requireNonNull($.server, "expected parameter 'server' to be non-null");
            return $;
        }
    }

}