// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Yundun.Inputs
{

    public sealed class BastionHostInstanceLdapAuthServerArgs : global::Pulumi.ResourceArgs
    {
        [Input("account", required: true)]
        public Input<string> Account { get; set; } = null!;

        [Input("baseDn", required: true)]
        public Input<string> BaseDn { get; set; } = null!;

        [Input("emailMapping")]
        public Input<string>? EmailMapping { get; set; }

        [Input("filter")]
        public Input<string>? Filter { get; set; }

        [Input("isSsl")]
        public Input<bool>? IsSsl { get; set; }

        [Input("loginNameMapping")]
        public Input<string>? LoginNameMapping { get; set; }

        [Input("mobileMapping")]
        public Input<string>? MobileMapping { get; set; }

        [Input("nameMapping")]
        public Input<string>? NameMapping { get; set; }

        [Input("password", required: true)]
        private Input<string>? _password;
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        [Input("server", required: true)]
        public Input<string> Server { get; set; } = null!;

        [Input("standbyServer")]
        public Input<string>? StandbyServer { get; set; }

        public BastionHostInstanceLdapAuthServerArgs()
        {
        }
        public static new BastionHostInstanceLdapAuthServerArgs Empty => new BastionHostInstanceLdapAuthServerArgs();
    }
}